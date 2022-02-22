package com.study.ut.powermock.local.service;

import com.study.ut.powermock.common.User;
import com.study.ut.powermock.local.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.fail;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class})
public class UserServiceTestWithPowerMockito {

    /**
     * 一开始未生效，因为修改了UserService里面的变量，所以需要添加注解
     *
     * @throws Exception
     * @RunWith(PowerMockRunner.class)
     * @PrepareForTest(UserService.class) # 准备修改UserService的字节码
     */
    @Test
    public void test_getCount_with_powerMock() throws Exception {
        UserService userService = new UserService();
        UserDao userDao = PowerMockito.mock(UserDao.class);
        whenNew(UserDao.class).withNoArguments().thenReturn(userDao);
        doReturn(10).when(userDao).getCount();
        Assert.assertEquals(10, userService.getCount());
    }

    @Test
    public void test_saveUser_with_powerMock() {
        try {
            User user = new User();
            UserService userService = new UserService();

            UserDao userDao = mock(UserDao.class);
            whenNew(UserDao.class).withAnyArguments().thenReturn(userDao);
            doNothing().when(userDao).saveUser(user);

            userService.saveUser(user);

            Mockito.verify(userDao).saveUser(user);
        } catch (Exception e) {
            fail();
        }
    }
}