package com.Chardikaala.JournalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_Check {
@GetMapping("/Healthcheck")
    public  String healthcheck(){
        return "ok";
    }
}
