/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.mybatis.mapper;

import java.util.List;


import cn.apopo.springboot.mybatis.entity.UserEntity;

/**
 * Created by qiaoshuang on 2016/12/11.
 */
public interface UserXmlMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(Long id);
}
