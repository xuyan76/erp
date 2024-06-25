package com.sysftech.erp.common.config;

import com.sysftech.erp.common.ApiResponse;
import com.sysftech.erp.common.utils.ResultBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ApiResponse<Object> handleException(Exception e){
        log.debug(e.getMessage());
        return ResultBuilder.fail(500, e.getMessage());
    }
}
