package com.example.p1.adapter;

public class AirConditioner implements Electronic220v{
    @Override
    public void connect() {
        System.out.println("220v on");
    }
}
