package com.example.swagger.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @ApiModelProperty(value = "사용자의 이름",example = "tomas", required = true) // 설명에 직접적인 추가와 샘플
    private String name;

    @ApiModelProperty(value = "사용자의 나이",example = "20", required = true) // 설명에 직접적인 추가와 샘플
    private int age;
}
