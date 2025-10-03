package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pages {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the countries page!!!";
    }

}
