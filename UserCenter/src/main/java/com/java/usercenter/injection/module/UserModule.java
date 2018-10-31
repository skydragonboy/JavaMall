package com.java.usercenter.injection.module;

import com.java.usercenter.service.UserService;
import com.java.usercenter.service.impl.UserServiceImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pan on 2018/10/17.
 */

@Module
public class UserModule {


    @Provides
    public UserService provideUserService(UserServiceImpl userService) {
        return userService;
    }


}
