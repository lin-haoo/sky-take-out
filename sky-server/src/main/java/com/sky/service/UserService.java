package com.sky.service;

import com.sky.entity.User;

public interface UserService {


    /**
     * 微信登录
      * @param userLoginDTO 微信登录DTO
      * @return 登录成功的用户信息
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}