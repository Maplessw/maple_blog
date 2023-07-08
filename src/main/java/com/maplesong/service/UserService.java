package com.maplesong.service;

import com.maplesong.domain.User;

public interface UserService {
    /*
    * 核对用户名
    * */
    User checkUser(String username, String password);


}
