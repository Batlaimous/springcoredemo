package com.beshoy.springcoredemo.common;
import jdk.jfr.Label;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In Contructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practice and run your coach";
    }
}
