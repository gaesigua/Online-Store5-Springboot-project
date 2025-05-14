package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("Das ist aus der Erste (First) Bean");
    }

    @Bean
    @Profile("dev")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Das ist aus der Zweite(Second) Bean");
    }

    @Bean
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("Das ist aus der dritte(Third) Bean");
    }

    @Bean
    public MyFirstClass myFourthBean() {
        return new MyFirstClass("Message from Fourth Bean");
    }
}
