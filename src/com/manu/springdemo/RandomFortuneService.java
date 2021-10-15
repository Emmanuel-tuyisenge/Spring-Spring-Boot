package com.manu.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] data ={
        "Java programming language is the best",
        "Never give-up, the effort ends up paying",
        "The lesson is the reward"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortne = data[index];
        return theFortne;
    }

}
