package com.springramework.dependences.controllers;

import com.springramework.dependences.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
