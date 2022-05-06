package com.example.p1.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s to connect",fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reader %s 's contents read",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s to disconnect",fileName);
        System.out.println(msg);
    }

}
