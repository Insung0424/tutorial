package com.example.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 이 클래스는 Rest api를 처리하는 Controller
@RequestMapping("/api") //RequestMapping 은 URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String hello(){
        return "Hello spring boot!";
    }
}
