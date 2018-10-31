package com.java.baselibrary.ui.activity;

import android.os.Bundle;

import com.java.baselibrary.common.BaseApplication;
import com.java.baselibrary.injection.component.ActivityComponent;
import com.java.baselibrary.injection.component.DaggerActivityComponent;
import com.java.baselibrary.injection.module.ActivityModule;
import com.java.baselibrary.injection.module.LifecycleProviderModule;
import com.java.baselibrary.presenter.BasePresenter;
import com.java.baselibrary.presenter.view.BaseView;

import javax.inject.Inject;

/**
 * Created by Pan on 2018/10/15.
 */

public class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements BaseView {


    @Inject
    public T mPresenter;

    public ActivityComponent mActivityComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivityInjection();


    }

    @Override
    public void showLoding() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError() {

    }


    private void initActivityInjection() {
        mActivityComponent = DaggerActivityComponent
                .builder()
                .appComponent(((BaseApplication) getApplication()).appComponent)
                .activityModule(new ActivityModule(this))
                .lifecycleProviderModule(new LifecycleProviderModule(this))
                .build();
    }


}
