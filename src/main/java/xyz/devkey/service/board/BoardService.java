package xyz.devkey.service.board;

import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.model.info.BoardInfo;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectOtherList(BoardDto boardDto);
}
