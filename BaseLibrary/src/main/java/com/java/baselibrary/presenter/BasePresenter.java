package com.java.baselibrary.presenter;

import com.java.baselibrary.presenter.view.BaseView;
import com.trello.rxlifecycle2.LifecycleProvider;

import javax.inject.Inject;

/**
 * Created by Pan on 2018/10/15.
 */


public class BasePresenter<T extends BaseView> {

    public T mView;

    @Inject
    public LifecycleProvider<?> lifecycleProvider;

}
