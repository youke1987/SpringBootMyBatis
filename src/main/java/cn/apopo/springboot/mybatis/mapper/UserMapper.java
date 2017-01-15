/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.apopo.springboot.mybatis.entity.UserEntity;

/**
 * Created by qiaoshuang on 2016/12/11.
 */
public interface UserMapper {

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "username"),
            @Result(property = "phone", column = "phone")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "username"),
            @Result(property = "phone", column = "phone")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO user(username, phone) VALUES(#{username}, #{phone})")
    void insert(UserEntity userEntity);

    @Update("UPDATE user SET username = #{userName}, phone = #{phone} WHERE id = #{id}")
    void update(UserEntity userEntity);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(Long id);

}
