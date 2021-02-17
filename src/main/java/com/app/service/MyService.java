package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String callService(String name){
        String result = "Hello, "+name;
        return result;
    }



}