package com.java.baselibrary.rx;

public class BaseException extends Throwable{

    public int status;
    public String message;

    public BaseException(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
