package com.example.SpringSecurityPractice;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public String displaySecretInfo(){
        return "THIS IS SECRET INFO";
    }
}
