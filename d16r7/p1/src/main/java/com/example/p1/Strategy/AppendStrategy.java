package com.example.p1.Strategy;

public class AppendStrategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}
