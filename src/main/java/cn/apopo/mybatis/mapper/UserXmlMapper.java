/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.mybatis.mapper;

import java.util.List;


import cn.apopo.mybatis.entity.UserEntity;

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
