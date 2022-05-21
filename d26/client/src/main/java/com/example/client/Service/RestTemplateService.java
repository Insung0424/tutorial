package com.example.client.Service;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

    //http://localhost/api/server/hello
    //response
    public UserResponse hello(){
        //public String hello(){
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                .queryParam("name","aaaa") // 기본주소뒤 추가로 붙게 하는 법
                .queryParam("age",99) // /hello?name=steve&age=10
                .encode().build().toUri(); //uri 주소만드는 방법
        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class);
        //ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        // 스트링으로 받는 방법

        // 여기서 사용 되는 get은 get메소드가 아니라 http에서 사용되는 get임

        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
        // 상세 내용 알기에는 getForEntity를 사용
        //UserResponse result = restTemplate.getForObject(uri, UserResponse.class);


        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());


        return result.getBody();
    }


//    public UserResponse post(){ //json 객체로 주고 받기위한 코드
    public void post(){
        // http://localhost:9090/api/server/user/{userId}/name/{userName}
        // 예제를 위한 주소이므로 실제로는 이렇게 쓰지 않음
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}") //괄호로 감싸는 게 중요함
                .encode()
                .build()
                .expand(100,"steve") // expand 를 계속 붙이는 게 아님
                .toUri();

        System.out.println(uri);

        // http body가 필요 -> object 만 보냄 -> object mapper 얘가 json으로 바꿔줌
        // -> rest template 에서 http body json 으로 넣어줌

        UserRequest req = new UserRequest();
        req.setName("steve");
        req.setAge(10);

        //응답을 뭘로 받을지 지정한 곳 ResponseEntity는 응답받을 때
        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri,req,UserResponse.class);
        //json 객체로 주고 받기위한 코드
        ResponseEntity<String> response = restTemplate.postForEntity(uri,req,String.class);

        System.out.println(response.getStatusCode()); //String -> 200 OK
        System.out.println(response.getHeaders());
        //String -> [Content-Type:"application/json", Transfer-Encoding:"chunked", Date:"Sat, 21 May 2022 06:03:25 GMT", Keep-Alive:"timeout=60", Connection:"keep-alive"]
        System.out.println(response.getBody()); //String -> {"name":"steve","age":10}

//        return response.getBody(); //json 객체로 주고 받기위한 코드
    }

//    public UserResponse exchange(){ //서버가 header를 요구할 때 RequestEntity=보낼 때
//        URI uri = UriComponentsBuilder
//                .fromUriString("http://localhost:9090")
//                .path("/api/server/user/{userId}/name/{userName}") //괄호로 감싸는 게 중요함
//                .encode()
//                .build()
//                .expand(100,"steve") // expand 를 계속 붙이는 게 아님
//                .toUri();
//
//        System.out.println(uri);
//
//        UserRequest req = new UserRequest();
//        req.setName("steve");
//        req.setAge(10);
//
//        RequestEntity<UserRequest> requestEntity = RequestEntity
//                .post(uri)
//                .contentType(MediaType.APPLICATION_JSON)
//                .header("x-authorization", "abcd")
//                .header("custom-header","ffffff")
//                .body(req);
//
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity,UserResponse.class);
//        return response.getBody();
//    }

    public Req<UserResponse> genericExchange() {
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}") //괄호로 감싸는 게 중요함
                .encode()
                .build()
                .expand(100, "steve") // expand 를 계속 붙이는 게 아님
                .toUri();

        System.out.println(uri);

        UserRequest userRequest = new UserRequest();
        userRequest.setName("steve");
        userRequest.setAge(10);

        Req<UserRequest> req = new Req<UserRequest>();
        req.setHeader(
                new Req.Header()
        );
        req.setResBody(
                userRequest
        );


        RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "ffffff")
                .body(req);


        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Req<UserResponse>> response
                = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<>(){});
//        = restTemplate.exchange(requestEntity,Req<UserResponse>.class);
//        generic 타입은 Req<UserResponse>.class 가 없음

        return response.getBody();
        // getBody() - ResponseEntity의 바디
//        .getrBody() - req 의 바디

    }


}
