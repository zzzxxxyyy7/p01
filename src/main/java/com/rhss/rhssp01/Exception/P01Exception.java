package com.rhss.rhssp01.Exception;

/**
 * @create 2020-04-09 16:08
 * 自定义异常
 */
public class P01Exception extends RuntimeException {
    String error_message;

    public P01Exception() {
    }

    public P01Exception(String error_message) {
        super(error_message);
        this.error_message = error_message;
    }

    public String getError_message() {
        return error_message;
    }

    public void cast(String error_message) {
        throw new P01Exception(error_message);
    }
}
