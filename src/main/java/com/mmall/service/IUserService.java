package com.mmall.service;


import com.mmall.commom.ServerResponse;
import com.mmall.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
