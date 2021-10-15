package com.manu.springdemo;

public class MyApp {

    public static void main(String[] args) throws Exception {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
