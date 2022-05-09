package com.example.Put;

import com.example.Put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class PutApiController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name="userId") Long id){
        System.out.println(id);
        return requestDto;
    }



}
//{
//        "name" : "tomas",
//        "age" : 20,
//        "car_list" : [
//        {
//        "name" : "BMW",
//        "car_number" : "11y 1234"
//        },
//        {
//        "name" : "K5",
//        "car_number" : "11a 1234"
//        }
//        ]
//        }