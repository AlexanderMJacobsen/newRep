package com.example.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Pages {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("messeage", "welcome");
        return "home/index";
    }
}
