package com.example.dynamic_api.controller;

import com.example.dynamic_api.service.MainServiceInf;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
//@RequiredArgsConstructor
@RequestMapping("/main-api")
public class MainController {

    @Autowired
    private MainServiceInf mainService;

    @PostMapping()
    public Object saveProcess(@RequestBody String body) throws Exception{
        return mainService.processApi(body);
    }

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
}
