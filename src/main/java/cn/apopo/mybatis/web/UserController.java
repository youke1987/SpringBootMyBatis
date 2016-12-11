/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.mybatis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.apopo.mybatis.entity.UserEntity;
import cn.apopo.mybatis.mapper.UserMapper;
import cn.apopo.mybatis.mapper.UserXmlMapper;

/**
 * Created by qiaoshuang on 2016/12/11.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user = userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/getXmlUsers")
    public List<UserEntity> getXmlUsers() {
        List<UserEntity> users = userXmlMapper.getAll();
        return users;
    }

    @RequestMapping("/getXmlUser")
    public UserEntity getXmlUser(Long id) {
        UserEntity user = userXmlMapper.getOne(id);
        return user;
    }
}
