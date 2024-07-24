package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public String getMessage()
    {
        return "Message returned from com.example.demo.FirstService";
    }
}
