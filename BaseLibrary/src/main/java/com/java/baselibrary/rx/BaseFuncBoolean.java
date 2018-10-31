package com.java.baselibrary.rx;

import com.java.baselibrary.data.protocol.BaseResp;

import rx.Observable;
import rx.functions.Func1;

public class BaseFuncBoolean<T> implements Func1<BaseResp<T>, Observable<Boolean>> {

    @Override
    public Observable<Boolean> call(BaseResp<T> t) {
        if (t.status != 0) {
            return Observable.error(new BaseException(t.status, t.message));
        }
        return Observable.just(true);
    }
}