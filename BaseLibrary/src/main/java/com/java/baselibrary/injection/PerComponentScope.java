package com.java.baselibrary.injection;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Created by 29111 on 2018/8/24.
 */
/*
    Activity级别 作用域
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerComponentScope {
}
