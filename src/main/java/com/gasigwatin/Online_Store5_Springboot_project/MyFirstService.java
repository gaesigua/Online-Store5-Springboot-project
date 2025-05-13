package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(
            @Qualifier("bean3")
            MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String greetEveryone(){
        return "The Third bean is greeting everyone saying: " + myFirstClass.sayHello();
    }
}
