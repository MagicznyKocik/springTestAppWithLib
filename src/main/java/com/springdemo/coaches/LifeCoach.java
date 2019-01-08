package com.springdemo.coaches;

import com.springdemo.interfaces.Coach;
import com.springdemo.interfaces.FortuneService;

public class LifeCoach implements Coach {

FortuneService fortuneService;

    public LifeCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
