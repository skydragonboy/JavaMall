package com.java.baselibrary.injection.component;

import android.content.Context;

import com.java.baselibrary.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Pan on 2018/10/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    Context context();

}
