package com.tms.common.handler;

import com.tms.common.constant.CommonConstants;
import com.tms.common.message.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResponse globalExceptionHandler(HttpServletResponse httpServletResponse, Exception e){
        log.error(e.getMessage(), e);

        httpServletResponse.setStatus(500);
        return new BaseResponse(CommonConstants.ResponseStatus.FAIL, e.getMessage());
    }

}
