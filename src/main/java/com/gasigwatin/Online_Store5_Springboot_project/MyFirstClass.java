package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.stereotype.Component;

public class MyFirstClass {

    private String begrussung;

    public MyFirstClass(String begrussung) {
        this.begrussung = begrussung;
    }

    public String sayHello() {
        return "Hallo Alles! Willkomen sie " + begrussung;
    }
}
