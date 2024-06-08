package com.sysftech.erp.common.utils;

import com.sysftech.erp.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Slf4j
public class ResultBuilder {

    public static <T> ApiResponse<T> success(String message, T data){
        return new ApiResponse<>(200, message, LocalDateTime.now(), data);
    }

    public static <T> ApiResponse<T> success(T data){
        return success("success", data);
    }

    public static <T> ApiResponse<T> success(String message){
        return success(message, null);
    }

    public static <T> ApiResponse<T> success() {
        return success("success!", null);
    }

    public static <T> ApiResponse<T> fail(int code, String message, T data){
        return new ApiResponse<>(code, message, LocalDateTime.now(), data);
    }

    public static <T> ApiResponse<T> fail(int code, String message){
        return new ApiResponse<>(code, message, LocalDateTime.now(), null);
    }
}
