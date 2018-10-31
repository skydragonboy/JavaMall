package com.java.baselibrary.injection.component;

import android.app.Activity;
import android.content.Context;

import com.java.baselibrary.injection.ActivityScope;
import com.java.baselibrary.injection.module.ActivityModule;
import com.java.baselibrary.injection.module.LifecycleProviderModule;
import com.trello.rxlifecycle2.LifecycleProvider;
//import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Component;

/**
 * Created by Pan on 2018/10/17.
 */

@ActivityScope
@Component(dependencies = {AppComponent.class}, modules = {ActivityModule.class, LifecycleProviderModule.class})
public interface ActivityComponent {

    Context context();

    Activity activity();

    LifecycleProvider<?> lifecycleProvider();

}
