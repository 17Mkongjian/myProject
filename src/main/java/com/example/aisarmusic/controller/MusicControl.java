package com.example.aisarmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MusicControl {


    @GetMapping
    public String sayHello() {
        return "我是你的第一个项目页面！";
    }
}
