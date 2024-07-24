package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer {
    private FirstService firstservice;
    private SecondService secondservice;

    @Autowired
    public ServiceConsumer(FirstService firstservice)
    {
        this.firstservice=firstservice;
    }
    @Autowired
    public void setSecondservice(SecondService secondservice)
    {
        this.secondservice = secondservice;
    }


    public void displayMessage()
    {
        System.out.println(firstservice.getMessage());
        System.out.println(secondservice.getMessage());
    }
}
