package com.maplesong.service.impl;

import com.maplesong.dao.UserDao;
import com.maplesong.domain.User;
import com.maplesong.service.UserService;
import com.maplesong.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-02 09:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }


}
