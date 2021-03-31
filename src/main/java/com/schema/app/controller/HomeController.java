package com.schema.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/")
@CrossOrigin()
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("BEM VINDO!");
    }
       
}
