package com.rhss.rhssp01.Utils;

/**
 * 正常返回统一响应类
 * @param <T>
 */

public class RestResponse<T> {
    // 返回码
    private String code;
    // 返回信息
    private String message;
    // 返回数据
    private T data;
    // 构造方法
    public RestResponse() {
    }
    public RestResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public void ok() {
        this.code = "200";
        this.message = "操作成功";
    }
    public RestResponse<T> ok(T data) {
        this.code = "200";
        this.message = "操作成功";
        this.data = data;
        return this;
    }
}
