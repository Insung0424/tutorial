package com.example.swagger.controller;

import com.example.swagger.dto.UserRequest;
import com.example.swagger.dto.UserRes;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"Api 정보를 제공하는 controller"})
@RestController
@RequestMapping("/api")
public class ApiController {

    // 이대로 서버를 실행하려니 오류가 발생 컨트롤러를 끄고 메인만 실행해도 널포인트에러가 나서 구글링결과
    // https://jackyee.tistory.com/24 여기서 해결법을 찾았다
    // 스프링부트버전과 swagger 의 버전간에 충돌이 발생한다고 블로그에서 설명한다
    // springfox boot starter 는 예전처럼 어노테이션불러오고 할 필요가 없다고 했으나
    // 오류로 인해 어노테이션도 붙여주고 직접 설정도 잡아 줘야했음
    // 블로그 주인이 직접 파일 구조를 보고 추가 할 부분도 적어줬으니 그대로 추가하면됨
    // 접속 경로는 http://localhost:8080/swagger-ui/index.html
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "x",value = "x값",required = true,dataType = "int",paramType = "path"),
            @ApiImplicitParam(name = "y",value = "y값",required = true,dataType = "int",paramType = "query")
            // 구체적인 설명을 추가하지 않으면 널포인트에러가 발생됨
            })
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x,@RequestParam int y){
        /*
        @ApiParam(value = "x값") //변수설명 @PathVariable int x,
            @ApiParam(value = "y값") //변수설명 b@RequestParam int y

            변수가 늘어날수록 불편한 형태
         */
        return x+y;
    }

    @ApiResponse(code = 502, message = "사용자의 나이가 10살 이하일때") // web 응답에 따른 설명 ex) 404,502
    @ApiOperation(value = "사용자의 나이와 사용자의 이름을 리턴하는 메소드") //메소드에 대한 설명
    @GetMapping("/user")
    public UserRes user(UserRequest userRequest){
        return new UserRes(userRequest.getName(), userRequest.getAge());
    }


    @PostMapping("/user")
    public UserRes userPost(@RequestBody UserRequest userReq){
        return new UserRes(userReq.getName(), userReq.getAge());
    }
}
