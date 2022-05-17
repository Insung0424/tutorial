package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class ApiController {

    @GetMapping("")
    public User get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age){
        User user = new User();
        user.setAge(age);
        user.setName(name);

        int a = 10+age;

        return user;
    }


    @PostMapping("")
    public User post(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }


    //특정 메서드의 예외 잡는법 같은 핸들러가 여러개있으면 우선권은 자체컨트롤러가 가지며 후순서컨트롤러는 작동하지않는다
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    public ResponseEntity MethodArgumentNotValidException(MethodArgumentNotValidException e){
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//    }
}
