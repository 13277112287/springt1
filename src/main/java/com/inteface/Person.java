package com.inteface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
     Car car;


    public void drive(){
        car.run();
    }
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public void say(){

        System.out.println("person hello");
    }
}
