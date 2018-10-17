package com.java.baselibrary.injection.module;

import android.app.Activity;

import com.java.baselibrary.injection.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pan on 2018/10/17.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }


    @ActivityScope
    @Provides
    Activity providesActivity() {
        return mActivity;
    }
}
