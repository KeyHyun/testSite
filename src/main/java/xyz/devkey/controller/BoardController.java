package xyz.devkey.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.model.info.BoardInfo;
import xyz.devkey.service.board.BoardService;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/other")
    private String otherBoard(@ModelAttribute("boardDto") BoardDto boardDto, Model model){

        List<BoardDto> list = boardService.selectOtherList(boardDto);

        log.info(list.toString());
        model.addAttribute("list", list);

        return "content/board/other";
    }

}
