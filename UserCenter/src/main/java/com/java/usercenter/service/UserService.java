package com.java.usercenter.service;


import io.reactivex.Observable;

public interface UserService {
    Observable<String> register(String mobile, String pwd, String verifyCode);
}
