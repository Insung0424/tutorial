package com.example.demo.aop;


import com.example.demo.dto.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Aspect
@Component
public class DecodeAop {

    @Pointcut("execution(* com.example.demo.aop.controller..*.*(..))")
    private void cut(){}

    @Pointcut("@annotation(com.example.demo.annotation.Decode)") //com.example.aop.annotation.Timer 따라쓰다 문제발생
    private void enableDecode(){}                                //다른경로에 있기때문에 확실히 적어줘야함

    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {

        Object[] args = joinPoint.getArgs();
        for (Object arg:args){
            if (arg instanceof User){

                User user = User.class.cast(arg);
                String base64Email = user.getEmail();
                String email = new String(Base64.getDecoder().decode(base64Email),"UTF-8");
                user.setEmail(email);
            }
        }
    }

    @AfterReturning(value = "cut() && enableDecode()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        if (returnObj instanceof User){
            User user = User.class.cast(returnObj);
            String email = user.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());
            user.setEmail(base64Email);
        }// decode 안됨 dG9tYXNAbmF2ZXIuY29t 그대로 들어옴
    }




}
