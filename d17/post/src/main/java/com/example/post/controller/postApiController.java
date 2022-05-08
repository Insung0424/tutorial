package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class postApiController {

//    @PostMapping("/post")
//    public void post(@RequestBody Map<String ,Object> requestData){
//
//        requestData.forEach((key, value) -> {
//            System.out.println("key : " + key);
//            System.out.println("value : " + value);
//        });
//
//    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
          //@RequestBody  json data 를 파싱하기위한 어노테이션
//파싱은 어떤 페이지(문서, html 등)에서 내가 원하는 데이터를 특정 패턴이나 순서로 추출해 가공하는 것을 말한다
        System.out.println(requestData);

    }
}
