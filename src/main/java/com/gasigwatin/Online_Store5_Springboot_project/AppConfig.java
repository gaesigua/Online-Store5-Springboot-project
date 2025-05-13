package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("bean1")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("Message from First Bean");
    }

    @Bean("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Message from Second Bean");
    }

    @Bean("bean3")
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("Message from Third Bean");
    }
}
