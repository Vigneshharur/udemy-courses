package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("CricketCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket for 15 minutes!!!!";
    }

}
