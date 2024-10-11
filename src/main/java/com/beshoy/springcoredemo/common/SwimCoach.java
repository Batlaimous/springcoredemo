package com.beshoy.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In contractor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim swim swim you can do it";
    }

}
