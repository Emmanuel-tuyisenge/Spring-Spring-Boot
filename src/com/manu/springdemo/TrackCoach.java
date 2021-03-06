package com.manu.springdemo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;
    private RandomFortuneService randomFortuneService;

    public TrackCoach() {

    }
    public TrackCoach(FortuneService fortuneService, RandomFortuneService randomFortuneService) {
        this.fortuneService = fortuneService;
        this.randomFortuneService = randomFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune()+ "\n" + randomFortuneService.getFortune();
    }

}
