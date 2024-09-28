package com.greenbean.autorization.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/ping")
public class PingController {
    
    @GetMapping
    public String ping(){
        return "Pong";
    }

}
