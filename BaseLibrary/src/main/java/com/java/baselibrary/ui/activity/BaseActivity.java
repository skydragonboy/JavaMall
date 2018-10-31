package com.java.baselibrary.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.java.baselibrary.common.AppManager;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

/**
 * Created by Pan on 2018/10/15.
 */

public class BaseActivity extends RxAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getInstance().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getInstance().finishActivity(this);
    }
}
