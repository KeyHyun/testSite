package xyz.devkey.service.admin.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import xyz.devkey.mapper.AdminMapper;
import xyz.devkey.mapper.TestMapper;
import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.service.admin.AdminService;
import xyz.devkey.utils.DateUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Value("${thumbnail.path}")
    private String storePath;

    @Autowired
    private AdminMapper mapper;

    @Override
    public void storeFile(MultipartFile file) {
        try{
            File storeDir = new File(storePath + DateUtils.getCurrentDay());
            if(!storeDir.isDirectory() || !storeDir.exists()){
                storeDir.mkdirs();
            }
            Path path = Paths.get(storePath + DateUtils.getCurrentDay() + File.separatorChar + file.getOriginalFilename());
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            log.error(e+"");
        }
    }

    @Override
    public int insertContent(BoardDto boardDto) {
        return mapper.insertContent(boardDto);
    }


}
