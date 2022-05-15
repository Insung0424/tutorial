package com.example.objectmapper;

import com.example.objectmapper.dto.Car;
import com.example.objectmapper.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;


public abstract class main {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("main");

        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User();
        user.setAge(20);
        user.setName("tomas");

        Car car1 = new Car();
        car1.setName("K5");
        car1.setCarNumber("11z2222");
        car1.setType("sedan");

        Car car2 = new Car();
        car2.setName("Q5");
        car2.setCarNumber("11h3333");
        car2.setType("SUV");

        List<Car> carList = Arrays.asList(car1,car2);
        user.setCars(carList);

        //System.out.println(user);//encoding error -> setting (encoding fileencoding projectencoding utf-8)
                                //help findation (edit custom vm option) lastLine.add(Dfile.encoding=UTF-8)
                                //intellij off -> on
//        String json = objectMapper.writeValueAsString(user);
//        //System.out.println(json);
//
//        JsonNode jsonNode = objectMapper.readTree(json);
//        String _name = jsonNode.get("name").asText();
//        int _age = jsonNode.get("age").asInt();
//
//        System.out.println("name : "+_name);
//        System.out.println("age : "+_age);



    }
}
