package com.java.usercenter.data.api;

import com.java.baselibrary.data.protocol.BaseResp;
import com.java.usercenter.data.protocol.RegisterReq;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface UserApi {
    /*
       用户注册
    */
    @POST("userCenter/register")
    Observable<BaseResp<String>> register(@Body RegisterReq req);

    //获取气象接口
    @GET(value = "weather")
    Observable<String> getLocalWeather(@Query("city") String city);


}
