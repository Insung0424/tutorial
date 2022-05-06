package com.example.p1.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s to connect",fileName);
        System.out.println(msg);
    }


    public void write(){
        String msg = String.format("Writer %s write",fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s to disconnect",fileName);
        System.out.println(msg);
    }
}
