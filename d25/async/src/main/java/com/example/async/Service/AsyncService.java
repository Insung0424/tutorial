package com.example.async.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;


@Slf4j
@Service
public class AsyncService {
    //비동기 강의
    //@Async는 웹의 난이도가 올라갔을때 많이 사용 보통은 다른방식으로 한다고함 (web mvc)

    @Async("async-thread") // 지정한 이름의 쓰레드에서 작동하도록함(Appconfig)
    // 잘 알고 있으면 이것처럼 만들어서 하고 아니면 스프링 mvc?로 하라고함
    public CompletableFuture run(){
        return new AsyncResult(hello()).completable();
    }

    public String hello() {
        // 다른 쓰레드 에서 돌아야하는데 nio-8080-exec-1 여기서 같이 돔
        //  @Async 를 여기 달아놔서 그랬던 모양
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
                log.info("thread sleep ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "async hello";
    }
}
