package com.study.ut.powermock.helloworld.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.helloworld.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class UserServiceTestWithMockito {

    @Mock
    private UserDao userDao;

    @Test(expected = Exception.class)
    public void test_saveUser() {
        UserService userService = new UserService(userDao);
        userService.saveUser(new User());
    }

    @Test
    public void test_getCount_with_Mockito() {
        MockitoAnnotations.initMocks(this);
//        UserDao userDao1 = Mockito.mock(UserDao.class);
        UserService service = new UserService(userDao);
        Mockito.when(userDao.getCount()).thenReturn(10);
        Assert.assertEquals(10, service.getCount());


    }
}