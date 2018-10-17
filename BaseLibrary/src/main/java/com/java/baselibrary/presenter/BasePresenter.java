package com.java.baselibrary.presenter;

import com.java.baselibrary.presenter.view.BaseView;

/**
 * Created by Pan on 2018/10/15.
 */

public class BasePresenter<T extends BaseView> {

    public T mView;
}
