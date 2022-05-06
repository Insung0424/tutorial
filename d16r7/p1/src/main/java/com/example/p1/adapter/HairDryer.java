package com.example.p1.adapter;

public class HairDryer implements Electronic110v{
    @Override
    public void powerOn() {
        System.out.println("110v on");
    }
}
