package com.study.ut.powermock.local.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.local.dao.UserDao;

public class UserService {

    public void saveUser(User user) {
        UserDao userDao = new UserDao();
        userDao.saveUser(user);
    }

    public int getCount() {
        UserDao userDao = new UserDao();
        return userDao.getCount();
    }
}
