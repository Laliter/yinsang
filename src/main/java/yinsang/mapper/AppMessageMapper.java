package yinsang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import yinsang.bean.AppMessage;

import java.util.List;

@Mapper
public interface AppMessageMapper {
    @Select("SELECT * FROM appuser_message")
    List<AppMessage> selectAll();

    @Select("SELECT * FROM appuser_message WHERE id = #{id}")
    List<AppMessage> getMessById(String id);
}