package com.example.Hello.controller;

import com.example.Hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class getApiController {

    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    //get  http://localhost:9090/api/get/hi
    //("/hi")로 작성시 get/post/put/delete 전부 동작
    public String hi(){
        return "hi";
    }

    //  http://localhost:9090/api/get/path-variable/{name}:변하는값
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
     //      {id} -> (name = "id") // 변수 이름을 다르게 설정할때 방법
        System.out.println("pathVariable : " + pathName);
        return pathName;
    }

    // ? key=value & key=value ......
    // http://localhost:9090/api/get/query-param?user=tomas&email=tomas@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = "+ entry.getValue()+"\n");
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(  //명시적으로 만들어줌
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }

    // http://localhost:9090/api/get
    // /query-param?user=tomas&email=tomas@gmail.com&age=30
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        //quertparam 가 바로 받을수있게 객체(UserRequest)로 정의해준다
        // &address=seoul 을 주소창에 작성해도 UserRequest에 변수로 저장되지않으면 사용x
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
