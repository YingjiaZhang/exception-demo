package com.example.exception.demo.interceptor;

import com.example.exception.demo.errors.ErrorCode;
import com.example.exception.demo.errors.ErrorMessage;
import com.example.exception.demo.exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorMessage handleException(BadRequestException ex) {
        log.warn("request exception", ex);
        return new ErrorMessage(ex.getErrorCode().getCode(), ex.getMessage());
    }
}
