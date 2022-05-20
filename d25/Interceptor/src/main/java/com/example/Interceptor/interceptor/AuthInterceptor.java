package com.example.Interceptor.interceptor;

import com.example.Interceptor.Annotation.Auth;
import com.example.Interceptor.Exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;


@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        URI uri = UriComponentsBuilder.fromUriString(request.getRequestURI())
                .query(request.getQueryString())
                .build().toUri();
        log.info("request url : {}",url);
        boolean hasAnnotation = checkAnnotation(handler, Auth.class);
        log.info("has annotation : {}",hasAnnotation); //private일때 나옴

        //서버가 모두 public으로 동작하는데 Auth 권한을 가진 요청에 대해서는 세션,쿠키
        if (hasAnnotation){
            //권한 체크
            String query = uri.getQuery();
            log.info("query : {}",query);
            if (query.equals("name=steve")){
                return true;
            }
            throw new AuthException(); //steve가 아니면 GlobalExceptionHandler 로 넘어감
        }

        return true;
    }

    private boolean checkAnnotation(Object handler,Class clazz){

        //resoure -> pass
        if(handler instanceof ResourceHttpRequestHandler){
            return true;
        }

        //annotation check
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        if (null != handlerMethod.getMethodAnnotation(clazz) || null != handlerMethod.getBeanType().getAnnotation(clazz)){
            // Auth annotation 이 있을때는 true
            return true;
        }

        return false;
    }
}
