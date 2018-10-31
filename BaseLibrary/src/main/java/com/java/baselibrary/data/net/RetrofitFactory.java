package com.java.baselibrary.data.net;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitFactory {

    private final Retrofit retrofit;
    private final Interceptor interceptor;

    //私有化构造方法
    private RetrofitFactory() {

        interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("Content_Type", "application/json")
                        .addHeader("charset", "UTF-8")
//                        .addHeader("token",)
                        .build();
                return chain.proceed(request);
            }
        };

        retrofit = new Retrofit.Builder()
                .baseUrl("http://120.78.128.91/api/")
//                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build();


    }

    private static class RetrofitFactoryHolder {
        private static final RetrofitFactory instance = new RetrofitFactory();
    }

    public static RetrofitFactory getInstance() {
        return RetrofitFactoryHolder.instance;
    }

    private OkHttpClient initClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
    }


    private HttpLoggingInterceptor initLogInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    public <T> T create(Class<T> service) {
        return retrofit.create(service);
    }
}
