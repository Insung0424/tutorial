package com.example.Interceptor.handler;


import com.example.Interceptor.Exception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //steve 가 아니므로 401을 내리겠다는 코딩HttpStatus.UNAUTHORIZED
    @ExceptionHandler(AuthException.class)
    public ResponseEntity authException(){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
