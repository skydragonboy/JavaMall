package com.java.baselibrary.ui.activity;

import com.java.baselibrary.presenter.BasePresenter;
import com.java.baselibrary.presenter.view.BaseView;

/**
 * Created by Pan on 2018/10/15.
 */

public class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements BaseView {

    protected T mPresenter;

    @Override
    public void showLoding() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError() {

    }


}
