package com.example.p1.sigleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
