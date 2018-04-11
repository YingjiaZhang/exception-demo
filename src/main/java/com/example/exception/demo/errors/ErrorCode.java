package com.example.exception.demo.errors;

public enum ErrorCode {
    INVALID_REQUEST(10000, "invalid request"),
    SERVER_ERROR(10001, "server error"),
    ORDER_NOT_FOUND(10002, "order not found"),
    ORDER_TYPE_NOT_FOUND(10003, "order type not found");

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
