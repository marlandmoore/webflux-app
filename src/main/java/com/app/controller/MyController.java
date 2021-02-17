package com.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.MyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/service")
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);
    private MyService service;
    
    @GetMapping("/hello")
    public String handle(@RequestParam(required = false) String name) {
      service = new MyService();
      return service.callService(name);
    }
}
