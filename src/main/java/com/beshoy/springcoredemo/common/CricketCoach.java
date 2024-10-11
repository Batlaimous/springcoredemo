package com.beshoy.springcoredemo.common;

/*import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;*/
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
/*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Contructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartStuff(){
        System.out.println("Inside doMyStartStuff " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyDestroyStuff(){
        System.out.println("Inside doMyStartStuff " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practica bowling for 15 minutes la practica wohooooooo!!!!!!";
    }
}
