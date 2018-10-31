package com.java.baselibrary.data.protocol;

public class BaseResp<T> {
    public int status;
    public String message;
    public T data;
}
