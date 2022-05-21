package com.example.server.Controller;


import com.example.server.dto.Req;
import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    //https://openapi.naver.com/v1/search/local.json
    // ?query=%EC%86%94%EB%8D%B0%EC%8A%A4%ED%81%AC
    // &display=10
    // &start=1
    // &sort=random
    @GetMapping("/naver")
    public String naver(){
        String query = "솔데스크"; //검색할것

        String encode = Base64.getEncoder().encodeToString(query.getBytes(StandardCharsets.UTF_8));
        // 인코더 불러오기인데 이걸로 하면 작동이 이상하게 됨

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/local.json")
                .queryParam("query","솔데스크") //검색대상

               .queryParam("display",10) //검색결과 갯수
                .queryParam("start",1) //문서의 시작페이지
                .queryParam("sort","random") //정렬 : 랜덤
                .encode(Charset.forName("UTF-8")) //그냥 여기서 인코딩하는 게 좋음
                .build()
                .toUri();

        //        log.info("uri : {}",uri); 주소가 잘 만들어졌는디 확인

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> req
                = RequestEntity
                .get(uri)
                .header("X-Naver-Client-Id","jcHeXdXQVWnClf7zIjA7")
                .header("X-Naver-Client-Secret","Vm6lOQgZKE")
                .build();

        ResponseEntity<String> result = restTemplate.exchange(req, String.class);
        return result.getBody();
    }


    @GetMapping("/hello")
    public User hello(@RequestParam String name, @RequestParam int age){
        //@RequestParam String name, @RequestParam int age client 에서 받는 방법
        //public String hello(){ 스트링 형태로 받는 방법
        User user = new User();
        user.setName(name);//set 에 @RequestParam 값을 직접 준것을 에코 라고함
        user.setAge(age);
        //public User hello(){ // 직접 입력?
//        User user = new User();
//        user.setName("steve");
//        user.setAge(20);

        // return "hello server"; 스트링 형태로 받는 방법
       return user;
    }

//    @PostMapping("/user/{userId}/name/{userName}")
//    public User post(@RequestBody User user,
//                     @PathVariable int userId,
//                     @PathVariable String userName){
//        log.info("userId : {}, userName : {}",userId,userName);
//
//        log.info("client req : {}",user);
//
//        return user;
//    }

//    @PostMapping("/user/{userId}/name/{userName}") //서버가 header를 요구할 때
//    public User post(@RequestBody User user,
//                     @PathVariable int userId,
//                     @PathVariable String userName,
//                     @RequestHeader("x-authorization") String authorization,
//                     @RequestHeader("custom-header") String customHeader){
//        log.info("userId : {}, userName : {}",userId,userName);
//        log.info("authorization : {}, custom : {}",authorization,customHeader);
//
//        log.info("client req : {}",user);
//
//        return user;
//    }


    //서버가 header를 요구하며 json 형태가 header + body로 이루어질 때
    @PostMapping("/user/{userId}/name/{userName}")
    public Req<User> post(
                     //HttpEntity<String> entity, 같은 이름의 바디를 호출해야하는데 그건 해결해놓고 
                     //이 코드를 계속 활성화 해놔서 에러가 계속됨
                     @RequestBody Req<User> user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader){
//        log.info("req : {}",entity.getBody());
        log.info("userId : {}, userName : {}",userId,userName);
        log.info("authorization : {}, custom : {}",authorization,customHeader);

        log.info("client req : {}",user);

        Req<User> response = new Req<>();
        response.setHeader(
                new Req.Header()
        );
        response.setResBody(user.getResBody());
//        response.setRbody(null);
        return response;
    }

}
