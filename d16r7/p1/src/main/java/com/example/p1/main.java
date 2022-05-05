package com.example.p1;

import com.example.p1.sigleton.AClazz;
import com.example.p1.sigleton.BClazz;
import com.example.p1.sigleton.SocketClient;

public class main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println(aClient.equals(bClient));
        //단 하나의 객체만 존재하고 그걸 공유해서 사용한다
    }
}
