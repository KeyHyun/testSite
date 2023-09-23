package xyz.devkey.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.devkey.model.dto.BoardDto;
import xyz.devkey.model.info.BoardInfo;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {

    List<BoardDto> selectOtherList(BoardDto boardDto);
}
