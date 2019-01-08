package com.springdemo.coaches;

import com.springdemo.interfaces.Coach;
import com.springdemo.interfaces.FortuneService;

public class BaseballCoach implements Coach {

    //define private field
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    //define constructor


    public BaseballCoach() {
        System.out.println("constructor in baseball coach");
    }

    public String getEmailAddress() {
        System.out.println("inside Baseball coach get email");
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside Baseball coach set email");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        System.out.println("inside Baseball coach get team");
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside Baseball coach set team");
        this.team = team;
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice 30 minutes of batting";

    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
