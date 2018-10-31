package com.java.baselibrary.injection.module;


import com.trello.rxlifecycle2.LifecycleProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pan on 2018/10/31.
 */

@Module
public class LifecycleProviderModule {
    public final LifecycleProvider lifecycleProvider;

    public LifecycleProviderModule(LifecycleProvider lifecycleProvider) {
        this.lifecycleProvider = lifecycleProvider;
    }

    @Provides
    public LifecycleProvider<?> provideLifecycleProvider() {
        return this.lifecycleProvider;
    }

}

