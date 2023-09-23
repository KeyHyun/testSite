package xyz.devkey.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.service.admin.AdminService;

import javax.servlet.http.HttpServletRequest;


@Controller
@Slf4j
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/main")
    public String admin(HttpServletRequest request, Model model, @ModelAttribute("boardDto") BoardDto boardDto){

        return "content/admin/write";
    }

    @RequestMapping(value = "/regView")
    public String regView(HttpServletRequest request, Model model, @ModelAttribute("boardDto") BoardDto boardDto){

        return "content/admin/regView";
    }

    @RequestMapping(value = "/regist")
    @ResponseBody
    public boolean regist(MultipartHttpServletRequest request, Model model, @ModelAttribute("boardDto") BoardDto boardDto) {

        log.info(boardDto.toString());

        adminService.storeFile(boardDto.getFile());

        boardDto.setThumbnail(boardDto.getFile().getOriginalFilename());

        int result = adminService.insertContent(boardDto);

        if(result == 1){
            return true;
        }

        return false;
    }
}
