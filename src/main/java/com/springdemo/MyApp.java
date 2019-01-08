package com.springdemo;

import com.springdemo.coaches.TrackCoach;
import com.springdemo.interfaces.Coach;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }

}
