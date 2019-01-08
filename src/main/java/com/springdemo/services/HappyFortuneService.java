package com.springdemo.services;

import com.springdemo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
    return "This day will be great!";
    }
}
