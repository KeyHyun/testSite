package xyz.devkey.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.devkey.model.dto.BoardDto;

@Repository
@Mapper
public interface AdminMapper {
    int insertContent(BoardDto boardDto);
}
