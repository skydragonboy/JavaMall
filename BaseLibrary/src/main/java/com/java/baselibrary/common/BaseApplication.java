package com.java.baselibrary.common;

import android.app.Application;

import com.java.baselibrary.injection.component.AppComponent;
import com.java.baselibrary.injection.component.DaggerAppComponent;
import com.java.baselibrary.injection.module.AppModule;

/**
 * Created by Pan on 2018/10/17.
 */

public class BaseApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
