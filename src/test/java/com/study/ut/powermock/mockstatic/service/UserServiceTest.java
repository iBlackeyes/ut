package com.study.ut.powermock.mockstatic.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.mockstatic.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 这里要注意的是，在mockstatic时，被mock的静态方法类也应该被PrepareForTest
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class, UserDao.class})
public class UserServiceTest {

    @Test
    public void saveUser() {
        UserService userService = new UserService();
        User user = new User();
        PowerMockito.mockStatic(UserDao.class);
        PowerMockito.doNothing().when(UserDao.class);

        userService.saveUser(user);

        PowerMockito.verifyStatic();
    }

    @Test
    public void getCount() {
        PowerMockito.mockStatic(UserDao.class);
        PowerMockito.when(UserDao.getCount()).thenReturn(10);
        UserService userService = new UserService();
        Assert.assertEquals(10, userService.getCount());
    }
}