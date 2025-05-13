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

		MyFirstClass myFirstClass1 = context.getBean("bean2", MyFirstClass.class);

		System.out.println(myFirstClass1.sayHello());

		System.out.println("=======================================================");

		MyFirstService myFirstService = context.getBean(MyFirstService.class);

		System.out.println(myFirstService.greetEveryone());

		System.out.println("=====================================================");

//		System.out.println(myFirstService.getJavaVersion());

		System.out.println("=======================================================");

//		System.out.println(myFirstService.getOsName());

		System.out.println("=========================================================");

//		System.out.println(myFirstService.readServerPort());

		System.out.println("=========================================================");

		System.out.println(myFirstService.getMyCustomPropertyFromAnotherFile());

		System.out.println("========================================================");

		System.out.println(myFirstService.getAge());
	}
}