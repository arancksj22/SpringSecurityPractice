package com.example.SpringSecurityPractice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public String displaySecretInfo(HttpServletRequest request){
        return "THIS IS SECRET INFO! " + request.getSession().getId();
    }
}
