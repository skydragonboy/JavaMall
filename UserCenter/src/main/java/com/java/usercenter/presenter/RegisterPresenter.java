package com.java.usercenter.presenter;

import com.java.baselibrary.presenter.BasePresenter;
import com.java.usercenter.presenter.view.RegisterView;

/**
 * Created by Pan on 2018/10/15.
 */

public class RegisterPresenter extends BasePresenter<RegisterView> {

    public void registerReq() {
        mView.registerResult();
    }
}
