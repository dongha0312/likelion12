package org.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    //add
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b){
        return a+b;
    }

    //subtract
    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b){
        return a-b;
    }

    //multiply
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b){
        return a*b;
    }

    //divide
    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b){
        if (b == 0){
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }
        return a/b;
    }
}


