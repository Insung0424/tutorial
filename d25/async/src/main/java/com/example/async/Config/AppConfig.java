package com.example.async.Config;


import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AppConfig {

    @Bean("async-thread")
    public Executor asyncThread(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();

        threadPoolTaskExecutor.setMaxPoolSize(100);//threa 다루는법 찾아봐야함 이건 최대 사이즈
        threadPoolTaskExecutor.setCorePoolSize(10);//threa 다루는법 찾아봐야함 1 여기 차면 밑으로
        threadPoolTaskExecutor.setQueueCapacity(10);//threa 다루는법 찾아봐야함 2 여기 차면 10이 늘어나는데 아직모름
        threadPoolTaskExecutor.setThreadNamePrefix("Async-");
        return threadPoolTaskExecutor;

    }
}
