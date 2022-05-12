package com.example.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        return UrlEncoder.encode(message,"UTF-8");
    }

    private static String encode(String message, String s) {
        return message;
    }
}
