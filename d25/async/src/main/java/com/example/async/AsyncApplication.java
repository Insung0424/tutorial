package com.example.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = "com.example.async.Service.AsyncService") 
//Parameter 0 of constructor in 형태의 에러 발생 사용해야할 패키지를 찾지 못했다는 거였음
// 위의 어노테이션과 주소를 추가해서 해결 (https://hak0205.tistory.com/114)
@ComponentScan(basePackages = "com.example.async.Controller.ApiController")
// /api/hello 가 맞았는데 계속 404에러가 나서 위의 코드도 입력했더니 해결 / 또 길을 못찾음

public class AsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncApplication.class, args);
	}

}
