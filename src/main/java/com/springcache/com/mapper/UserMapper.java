package com.springcache.com.mapper;

import com.springcache.com.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Integer id);

    @Insert("insert into user  values(null,#{name},#{password},1)")
    void insertByUser(User user);

    @Delete("delete from user where id = #{id}")
    void deleteByUser(Integer id);

    @Update("update user set name = #{name} where id = #{id}")
    void updateByUser(User user);


}
