package com.rhss.rhssp01.Exception;

import java.io.Serializable;

/**
 * @description: 返回前端的异常信息模型
 */
public class RestErrorResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String errorMessage;

    public RestErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
