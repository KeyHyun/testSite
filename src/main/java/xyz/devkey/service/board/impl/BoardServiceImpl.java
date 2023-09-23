package xyz.devkey.service.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.devkey.mapper.BoardMapper;
import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.model.info.BoardInfo;
import xyz.devkey.service.board.BoardService;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper mapper;

    @Override
    public List<BoardDto> selectOtherList(BoardDto boardDto) {
        return mapper.selectOtherList(boardDto);
    }
}
