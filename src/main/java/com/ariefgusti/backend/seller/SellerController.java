package com.ariefgusti.backend.seller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellerController {
    @GetMapping("/sellers/")
    public String list(){
        return "sellers";
    }
}
