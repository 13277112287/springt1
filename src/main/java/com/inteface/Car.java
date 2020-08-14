package com.inteface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Car {
     Person person;


    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public void run(){
        System.out.println("=========My Name is car,i am running");
    }

    public void carAndPerson(){
        person.say();
    }
}
