package com.example.spring_calculator.controller;


import com.example.spring_calculator.component.Calculator;
import com.example.spring_calculator.component.Controller.CalculatorApiController;
import com.example.spring_calculator.component.DollarCalculator;
import com.example.spring_calculator.component.MarketApi;
import com.example.spring_calculator.dto.Req;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CalculatorApiController.class) //필요한것만 로딩 시킴
//@SpringBootTest 는 모든 bean 이 다 등록되어서 자원소비가 큼
@AutoConfigureWebMvc
@Import({Calculator.class, DollarCalculator.class})
public class CalculatorApiControllerTest {

    @MockBean
    private MarketApi marketApi;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void init(){
        Mockito.when(marketApi.connect()).thenReturn(3000);
    }

    @Test
    public void sumTest() throws Exception { //mockMvc.perform throws 처리함
        // http://localhost:8080/api/sum



        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/sum")
                        .queryParam("x","10")
                        .queryParam("y","10"))
                .andExpect(MockMvcResultMatchers.status().isOk()) // 20? : 40? 판단
                .andExpect(MockMvcResultMatchers.content().string("60000"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void minusTest() throws Exception {
        //ObjectMapper().writeValueAsString and mockMvc.perform throws -> Exception 이 됨
        // http://localhost:8080/api/minus

        Req req = new Req();
        req.setX(10);
        req.setY(10); // 여기도 x 값을 세팅해놓고 왜 결과가 다른지 찾고있었음

        String json = new ObjectMapper().writeValueAsString(req);

        mockMvc.perform(MockMvcRequestBuilders.post("http://localhost:8080/api/minus")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.response.resultCode").value("OK"))
                .andDo(MockMvcResultHandlers.print());
    }


}
