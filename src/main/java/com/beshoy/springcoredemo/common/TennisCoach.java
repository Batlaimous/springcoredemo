package com.beshoy.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("In Contructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practica Tennis please";
    }
}
