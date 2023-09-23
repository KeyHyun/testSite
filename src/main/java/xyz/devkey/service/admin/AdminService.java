package xyz.devkey.service.admin;

import org.springframework.web.multipart.MultipartFile;
import xyz.devkey.model.dto.BoardDto;

import java.io.IOException;

public interface AdminService {

    void storeFile(MultipartFile file) ;

    int insertContent(BoardDto boardDto);
}
