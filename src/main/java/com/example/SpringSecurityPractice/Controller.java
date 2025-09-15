package com.example.SpringSecurityPractice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/secretInfo")
public class Controller {

    MainService service;

    Controller(MainService service){
        this.service = service;
    }

    @GetMapping
    public String secretInfo(HttpServletRequest request){
        return service.displaySecretInfo(request);
    }
}
