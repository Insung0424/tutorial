package com.example.p1.facade;

public class Ftp {

    private String host;
    private int port;
    private  String path;

    public Ftp(String host,int port,String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("Ftp host : "+ host+" port : "+port);
    }

    public void moveDirectory(){
        System.out.println("path :"+ path + "to move");
    }

    public void disConnect(){
        System.out.println("shut down");
    }
}
