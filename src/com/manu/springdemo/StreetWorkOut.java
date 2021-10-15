package com.manu.springdemo;

public class StreetWorkOut implements Coach{

    private FortuneService fortuneService;

    public StreetWorkOut(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 1 hour on street-work-out";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
