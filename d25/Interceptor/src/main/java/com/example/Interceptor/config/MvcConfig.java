package com.example.Interceptor.config;


import com.example.Interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor//파이널로 선언된 객체를 생성자에서 주입받을 수 있음
public class MvcConfig implements WebMvcConfigurer {

    //@Autowired// RequiredArgsConstructor와 같음 순환참조가 일어날 수 있음
    private final AuthInterceptor authInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor).addPathPatterns("/api/private/*");
    }
}
