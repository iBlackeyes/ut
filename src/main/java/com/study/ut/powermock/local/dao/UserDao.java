package com.study.ut.powermock.local.dao;

import com.study.ut.powermock.common.User;

public class UserDao {
    public void saveUser(User user) {
        throw new UnsupportedOperationException("Don't support.");
    }

    public int getCount() {
        return 1;
    }
}
