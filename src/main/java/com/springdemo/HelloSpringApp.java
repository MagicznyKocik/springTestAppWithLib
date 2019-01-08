package com.springdemo;

import com.springdemo.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);


        // call methods on the bean

        System.out.println(theCoach.getDailyWorkout());

        // call fortune service method
        System.out.println(theCoach.getDailyFortune());

        // close context

        context.close();

    }

}
