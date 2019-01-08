package com.springdemo;

import com.springdemo.coaches.LifeCoach;

import com.springdemo.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachFortuneTelling {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach lifeCoach = context.getBean("myLifeCoach", Coach.class);

        System.out.println(lifeCoach.getDailyFortune());
        System.out.println(lifeCoach.getDailyFortune());
        System.out.println(lifeCoach.getDailyFortune());
        System.out.println(lifeCoach.getDailyFortune());



    }
}
