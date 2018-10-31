package com.java.usercenter.data.protocol;

public class RegisterReq {
    String mobile;
    String pwd;
    String verifyCode;

    public RegisterReq(String mobile, String pwd, String verifyCode) {
        this.mobile = mobile;
        this.pwd = pwd;
        this.verifyCode = verifyCode;
    }

    public RegisterReq() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
