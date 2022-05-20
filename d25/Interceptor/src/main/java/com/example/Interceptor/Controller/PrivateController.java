package com.example.Interceptor.Controller;


import com.example.Interceptor.Annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@Auth
@Slf4j
public class PrivateController {

    @GetMapping("/hello")
    public String hello(){
        log.info("private hello controller");

        return "private hello"; // preHandle 값이 true가 되야 여기가 실행됨
    }
}
