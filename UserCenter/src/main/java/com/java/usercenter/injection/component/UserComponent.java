package com.java.usercenter.injection.component;

import com.java.usercenter.injection.module.UserModule;
import com.java.usercenter.ui.activity.RegisterActivity;

import dagger.Component;

/**
 * Created by Pan on 2018/10/17.
 */

@Component(modules = UserModule.class)
public interface UserComponent {

    void inject(RegisterActivity activity);
}
