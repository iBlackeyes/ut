package com.study.ut.powermock.mockstatic.dao;

import com.study.ut.powermock.common.User;

public class UserDao {
    public static void saveUser(User user) {
        throw new UnsupportedOperationException("Don't support.");
    }

    public static int getCount() {
        return 1;
    }
}
