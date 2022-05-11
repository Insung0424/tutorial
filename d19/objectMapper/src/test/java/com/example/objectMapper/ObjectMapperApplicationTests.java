package com.example.objectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {
	// Text json -> object
	// object -> Text json

	//controller req json(text) -> object
	//response object -> json(text)
	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("=================================");

		var object = new ObjectMapper();
		// object -> Text
  		var user = new User("tomas",20,"010-1111-2222");
		ObjectMapper objectMapper = new ObjectMapper();
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);
		//ObjectMapper 가 get method 를 활용한다
		//클래스내에서 다른 get이 있다면 오류가 발생한다

		// Text -> object
		// object mapper는 default 생성자를 필요로 한다
		ObjectMapper objectUser = new ObjectMapper();
		objectMapper.readValue(text, User.class);
		//var objectUser = objectMapper.readValue(text, User.class); 오류대처안되서 위로 사용했는데
		//com.fasterxml.jackson.databind.ObjectMapper@1a88c4f5 이렇게 나옴

		System.out.println(objectUser);


	}

}
