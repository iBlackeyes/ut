package com.study.ut.powermock.helloworld.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.helloworld.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

public class UserServiceTestWithPowerMock {


    @Test
    public void test_getCount_with_Mockito() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(userDao.getCount()).thenReturn(10);
        UserService service = new UserService(userDao);
        Assert.assertEquals(10, service.getCount());
    }

    @Test
    public void test_saveUser_with_powerMockito() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        User user = new User();
        PowerMockito.doNothing().when(userDao).saveUser(user);
        UserService userService = new UserService(userDao);
        userService.saveUser(user);

//        Mockito.verify(userDao).saveUser(user);


    }
}