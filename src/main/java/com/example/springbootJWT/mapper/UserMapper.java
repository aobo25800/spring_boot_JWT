package com.example.springbootJWT.mapper;

import com.example.springbootJWT.dao.User;

public interface UserMapper {

    User insertUser();

    User selectUser();

    User updateUser();

}
