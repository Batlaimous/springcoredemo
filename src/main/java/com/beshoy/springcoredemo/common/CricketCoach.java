package com.beshoy.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Contructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practica bowling for 15 minutes la practica wohooooooo!!!!!!";
    }
}
