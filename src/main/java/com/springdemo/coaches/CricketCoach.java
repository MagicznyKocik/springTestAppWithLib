package com.springdemo.coaches;

import com.springdemo.interfaces.Coach;
import com.springdemo.interfaces.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;


    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach -inside emailAddress setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach -inside team setter");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public CricketCoach() {
        System.out.println("CricketCoach -inside of cricket coach constructor with no params");
    }


    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach -inside seter method in cricket coach");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hammer the balls for 15 minutes a day";
    }

    @Override
    public String getDailyFortune() {
        return "Really " + fortuneService.getFortune();
    }
}
