package com.example.client.Controller;


import com.example.client.Service.RestTemplateService;
import com.example.client.dto.Req;
import com.example.client.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    @Autowired
    private RestTemplateService restTemplateService;

//    @GetMapping("/hello")
//    public UserResponse getHello(){
//        //public String getHello(){
//        return restTemplateService.hello();
//    }

//    @GetMapping("/hello")
//    public UserResponse getHello(){
//        restTemplateService.post();
//        return new UserResponse();
//        //return restTemplateService.post(); json 으로 주고 받을 때 형태
//    }

//    @GetMapping("/hello") //서버가 header를 요구할 때
//    public UserResponse getHello(){
//        restTemplateService.exchange();
//        return new UserResponse();
//        //return restTemplateService.post(); json 으로 주고 받을 때 형태
//    }

    @GetMapping("/hello") //서버가 header를 요구하며 json 형태가 header + body로 이루어질 때
    public Req<UserResponse> getHello(){
        return restTemplateService.genericExchange();
    }
}
