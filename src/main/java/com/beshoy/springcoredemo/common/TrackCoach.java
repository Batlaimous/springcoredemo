package com.beshoy.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice and run your coach";
    }
}
