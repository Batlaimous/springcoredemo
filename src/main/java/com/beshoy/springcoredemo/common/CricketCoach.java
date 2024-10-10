package com.beshoy.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practica bowling for 15 minutes la practica maaaaiiiiiis!!!!!!";
    }
}
