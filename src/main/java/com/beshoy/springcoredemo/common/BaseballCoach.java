package com.beshoy.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach  implements Coach {

    public BaseballCoach() {
        System.out.println("In Contructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practice baseball";
    }
}
