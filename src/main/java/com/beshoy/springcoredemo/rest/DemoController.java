package com.beshoy.springcoredemo.rest;

import com.beshoy.springcoredemo.common.Coach;
import com.beshoy.springcoredemo.common.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myTennisCoach;
    private Coach myCricketCoach;
    private Coach myTrackCoach;
    private Coach myBaseballCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theTennisCoach) {
        myTennisCoach = theTennisCoach;
    }

    /*@Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCricketCoach) {
        myCricketCoach = theCricketCoach;
    }*/



    // define a setter injection
/*@Autowired
public void setCoach(Coach theCoach) {
    myCoach = theCoach;

}*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myTennisCoach.getDailyWorkout();
    }
}
