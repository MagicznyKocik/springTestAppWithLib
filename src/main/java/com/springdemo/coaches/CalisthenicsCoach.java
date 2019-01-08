package com.springdemo.coaches;

import com.springdemo.interfaces.Coach;

public class CalisthenicsCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Do 30 push ups and 10 pull ups in 3 series";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
