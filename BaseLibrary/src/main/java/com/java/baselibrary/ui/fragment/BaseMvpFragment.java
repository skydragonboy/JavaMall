package com.java.baselibrary.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.java.baselibrary.common.BaseApplication;
import com.java.baselibrary.injection.component.ActivityComponent;
import com.java.baselibrary.injection.component.DaggerActivityComponent;
import com.java.baselibrary.injection.module.ActivityModule;
import com.java.baselibrary.presenter.BasePresenter;
import com.java.baselibrary.presenter.view.BaseView;

import javax.inject.Inject;

/**
 * Created by Pan on 2018/10/15.
 */

public abstract class BaseMvpFragment<T extends BasePresenter> extends BaseFragment implements BaseView {


    @Inject
    public T mPresenter;

    public ActivityComponent mActivityComponent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initActivityInjection();
        injectComponent();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected abstract void injectComponent();

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
                .builder().appComponent(((BaseApplication) (getActivity().getApplication())).appComponent)
                .activityModule(new ActivityModule(getActivity()))
                .build();
    }


}
