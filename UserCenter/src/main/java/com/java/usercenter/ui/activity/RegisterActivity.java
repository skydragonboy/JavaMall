package com.java.usercenter.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.java.baselibrary.ui.activity.BaseMvpActivity;
import com.java.usercenter.R;
import com.java.usercenter.presenter.RegisterPresenter;
import com.java.usercenter.presenter.view.RegisterView;

public class RegisterActivity extends BaseMvpActivity<RegisterPresenter> implements RegisterView ,View.OnClickListener{


    Button mRegisterBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mRegisterBT = findViewById(R.id.mRegisterBT);
        mRegisterBT.setOnClickListener(this);

        mPresenter = new RegisterPresenter();
        mPresenter.mView = this;

    }

    @Override
    public void registerResult() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.mRegisterBT){
            mPresenter.registerReq();
        }
    }
}
