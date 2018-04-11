package com.example.exception.demo.errors;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private int code;
    private String message;
}
