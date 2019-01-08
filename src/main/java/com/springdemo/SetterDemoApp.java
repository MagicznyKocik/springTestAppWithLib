package com.springdemo;

import com.springdemo.coaches.BaseballCoach;
import com.springdemo.coaches.CricketCoach;
import com.springdemo.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);


        System.out.println(myCoach.getDailyFortune());

        System.out.println(myCoach.getDailyWorkout());

        System.out.println("Coach email address: " + myCoach.getEmailAddress());

        System.out.println("Coach team: " + myCoach.getTeam());

        BaseballCoach myBaseballCoach = context.getBean("myBaseballCoach", BaseballCoach.class);

        System.out.println(myBaseballCoach.getEmailAddress());
        System.out.println(myBaseballCoach.getTeam());




        context.close();

    }
}
