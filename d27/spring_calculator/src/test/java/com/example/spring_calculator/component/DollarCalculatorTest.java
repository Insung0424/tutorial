package com.example.spring_calculator.component;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;


@SpringBootTest
//@Import({MarketApi.class, DollarCalculatorTest.class}) // 주입받을 클래스
public class DollarCalculatorTest {

    @MockBean //mock이 아님
    private MarketApi marketApi;

    @Autowired
    private Calculator calculator;


    @Test // 실행을 눌렀는데 여기가 동작을 안해서 찾던중 테스트 어노테이션 안붙인걸 발견함
    public void dollarCalculatorTest(){

        Mockito.when(marketApi.connect()).thenReturn(3000);
//        dollarCalculator.init();
        int sum = calculator.sum(10,10);
        int minus = calculator.minus(10,10);
        System.out.println(sum);
        Assertions.assertEquals(60000, sum);
        Assertions.assertEquals(0, minus);
    }




}
