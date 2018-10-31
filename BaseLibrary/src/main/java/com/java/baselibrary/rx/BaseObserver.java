package com.java.baselibrary.rx;

import com.java.baselibrary.presenter.view.BaseView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class BaseObserver<T> implements Observer<T> {

    public BaseView baseView;

    public BaseObserver(BaseView baseView) {
        this.baseView = baseView;
    }


    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
