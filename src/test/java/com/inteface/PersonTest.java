package com.inteface;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class PersonTest {
@Autowired
    Person person;
@Autowired
    Car car;

@Test
    public void personDrive(){

    person.drive();
    System.out.println("person:"+person+"  car:"+person.car);
    System.out.println("car:"+car+"  person:"+car.person);
    ClassPathXmlApplicationContext a1;
}

}
