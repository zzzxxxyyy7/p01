package com.rhss.rhssp01.Exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    //对项目的自定义异常类型进行处理
    @ResponseBody
    @ExceptionHandler(value = P01Exception.class)
    public RestErrorResponse error(P01Exception e){
        return new RestErrorResponse(e.getError_message());
    }

    @ResponseBody
    @ExceptionHandler
    public RestErrorResponse error(Exception e){
        e.printStackTrace();
        return new RestErrorResponse("系统异常");
    }
}
