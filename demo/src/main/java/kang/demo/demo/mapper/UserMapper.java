package kang.demo.demo.mapper;

import kang.demo.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectUser( String name,String password);
}
