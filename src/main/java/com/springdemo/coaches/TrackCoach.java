package com.springdemo.coaches;

import com.springdemo.interfaces.Coach;
import com.springdemo.interfaces.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes running";
    }

    @Override
    public String getDailyFortune() {
        return"Just do it " + fortuneService.getFortune();
    }
}
