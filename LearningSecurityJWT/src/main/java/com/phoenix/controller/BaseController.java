package com.phoenix.controller;

/**
 * description:
 * date: 2020/5/6 3:48 下午
 * author: phoenix
 * version: 1.0.0
 */

class DomainResult {
    public String code;
    public String msg;
    public Object data;

    public DomainResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class BaseController {

    public DomainResult success(Object data) {
        return new DomainResult("0", "success", data);
    }

    public DomainResult fail(String code, String msg) {
        return new DomainResult(code, msg, null);
    }
}
