package com.java.baselibrary.injection.module;

import android.content.Context;

import com.java.baselibrary.common.BaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pan on 2018/10/17.
 */

@Module
public class AppModule {

    private BaseApplication mContext;

    public AppModule(BaseApplication context) {
        mContext = context;
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return mContext;
    }

}