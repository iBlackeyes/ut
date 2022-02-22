package com.study.ut.powermock.helloworld.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.helloworld.dao.UserDao;

public class UserService {

    private UserDao userDao;

    UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public int getCount() {
        return userDao.getCount();
    }
}
