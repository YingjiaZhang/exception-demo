package com.example.exception.demo.api;

import com.example.exception.demo.errors.ErrorCode;
import com.example.exception.demo.exceptions.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExceptionApi {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void throwException(){
        throw new BadRequestException(ErrorCode.INVALID_REQUEST);
    }
}
