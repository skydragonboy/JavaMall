package com.java.usercenter.data.respository;

import com.java.baselibrary.data.net.RetrofitFactory;
import com.java.usercenter.data.api.UserApi;

import javax.inject.Inject;

import io.reactivex.Observable;


public class UserRepository {


    @Inject
    public UserRepository() {
    }

    /*
           用户注册
        */
    public Observable<String> register(String mobile, String pwd, String verifyCode) {
        return RetrofitFactory.getInstance().create(UserApi.class).getLocalWeather("杭州");
    }

}
