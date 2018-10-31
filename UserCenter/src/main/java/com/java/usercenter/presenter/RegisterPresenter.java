package com.java.usercenter.presenter;

import android.util.Log;

import com.java.baselibrary.presenter.BasePresenter;
import com.java.baselibrary.rx.BaseObserver;
import com.java.usercenter.presenter.view.RegisterView;
import com.java.usercenter.service.UserService;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Pan on 2018/10/15.
 */

public class RegisterPresenter extends BasePresenter<RegisterView> {

    @Inject
    UserService userService;


    @Inject
    public RegisterPresenter() {
    }

    public void registerReq() {
        userService.register("123456", "123456", "123456")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(lifecycleProvider.<String>bindToLifecycle())
                .subscribe(new BaseObserver<String>(mView) {
                    @Override
                    public void onNext(String str) {
                        super.onNext(str);
                        Log.e("注册", str);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        Log.e("", e.getMessage());
                    }
                });
    }
}
