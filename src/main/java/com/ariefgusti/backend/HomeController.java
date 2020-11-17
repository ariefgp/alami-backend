package com.ariefgusti.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello SpringBoot";
    }
    
    
}
