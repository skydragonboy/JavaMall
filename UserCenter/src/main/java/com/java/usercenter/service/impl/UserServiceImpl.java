package com.java.usercenter.service.impl;


import com.java.usercenter.data.respository.UserRepository;
import com.java.usercenter.service.UserService;

import javax.inject.Inject;

import io.reactivex.Observable;


public class UserServiceImpl implements UserService {

    @Inject
    public UserRepository repository;

    @Inject
    public UserServiceImpl() {
    }

    @Override
    public Observable<String> register(String mobile, String pwd, String verifyCode) {
        return repository.register(mobile, pwd, verifyCode);
    }


}
