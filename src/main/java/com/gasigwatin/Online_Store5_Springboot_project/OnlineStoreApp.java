package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineStoreApp {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(OnlineStoreApp.class, args);

		MyFirstClass myFirstClass = context.getBean("bean1", MyFirstClass.class);

		System.out.println(myFirstClass.sayHello());

		System.out.println("=======================================================");

		MyFirstService myFirstService = context.getBean("bean3", MyFirstService.class);

		System.out.println(myFirstService.greetEveryone());
	}
}