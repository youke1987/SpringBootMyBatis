/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.mybatis.entity;

import java.io.Serializable;

/**
 * Created by qiaoshuang on 2016/12/11.
 */
public class UserEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String phone;

    public UserEntity() {
        super();
    }

    public UserEntity(String userName, String phone) {
        super();
        this.userName = userName;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "userName: " + this.userName + ", phone: " + this.phone;
    }
}
