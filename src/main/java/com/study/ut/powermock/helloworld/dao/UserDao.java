package com.study.ut.powermock.helloworld.dao;

import com.study.ut.powermock.common.User;

public class UserDao {
    public void saveUser(User user) {
        throw new UnsupportedOperationException("Don't support.");
    }

    public int getCount() {
        return 1;
    }
}
