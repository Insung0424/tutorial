package com.example.p1.aop;

import com.example.p1.proxy.Html;
import com.example.p1.proxy.IBrowser;

public class AopBrowser implements IBrowser {
// 프록시 패턴 : 특정한 부분에서 앞뒤로 내가 원하는 작업을 하는 방법
    private String url;
    private Html html;

    private Runnable before;
    private Runnable after;


    public AopBrowser(String url, Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();
        if (html == null){
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " +url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        after.run();
        System.out.println("AopBrowser html cache : " +url);
        return null;
    }
}
