package com.example.exception.demo.exceptions;

import com.example.exception.demo.errors.ErrorCode;
import lombok.Getter;

public class HttpException extends RuntimeException {
    @Getter
    private ErrorCode errorCode;

    public HttpException(ErrorCode code, String message) {
        super(message);
        this.errorCode = code;
    }

    public HttpException(ErrorCode code, Throwable cause) {
        super(code.getMessage(), cause);
        this.errorCode = code;
    }

    public HttpException(ErrorCode code, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = code;
    }

    public HttpException(ErrorCode code) {
        this(code, code.getMessage());
    }
}
