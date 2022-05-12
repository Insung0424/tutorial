package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
		ApplicationContext context = ApplicationContextProvider.getContext();

//		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);


//		Encoder encoder = context.getBean("base64Encoder",Encoder.class); bean 의 이름으로 encodig을 정함
		Encoder encoder = context.getBean("urlEn",Encoder.class);
		String url="www.naver.com/books/it?page=10&size=20&name=spring-boot";

//base64encdoer
		String result = encoder.encode(url);
		System.out.println(result);
//  d3d3Lm5hdmVyLmNvbS9ib29rcy9pdD9wYWdlPTEwJnNpemU9MjAmbmFtZT1zcHJpbmctYm9vdA==

//urlencdoer
//		encoder.setIEncoder(urlEncoder);
//		result = encoder.encode(url);
//
//		System.out.println(result);
//  www.naver.com/books/it?page=10&size=20&name=spring-boot

	}

}

@Configuration
class Appconfig{
	@Bean("base64Encoder")
	public Encoder encoder(Base64Encoder base64Encoder){
		return new Encoder(base64Encoder);
	}

	@Bean("urlEn")
	public Encoder encoder(UrlEncoder urlEncoder){
		return new Encoder(urlEncoder);
	}
}