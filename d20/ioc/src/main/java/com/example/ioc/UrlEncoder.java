package com.example.ioc;

public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        try {
            return UrlEncoder.encode(message, "UTF-8");
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static String encode(String message, String s) {
        return message;
    }
}
