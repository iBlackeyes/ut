package com.study.ut.powermock.mockstatic.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.mockstatic.dao.UserDao;

public class UserService {

    public void saveUser(User user) {
        UserDao.saveUser(user);
    }

    public int getCount() {
        return UserDao.getCount();
    }
}
