package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class OnlineStoreApp {
	public static void main(String[] args) {

		//Here we are programmatically setting our profile

		var app = new SpringApplication(OnlineStoreApp.class);

//		ConfigurableApplicationContext context = SpringApplication.run(OnlineStoreApp.class, args);

		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev"));

		var context = app.run(args);


		System.out.println("1. ================From Bean 1=========================");

		MyFirstClass myFirstClass = context.getBean("myFirstBean",MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());

		System.out.println("2. ================From Bean 2=========================");
		myFirstClass = context.getBean("mySecondBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());


		System.out.println("3. ================From Bean 3=========================");
		myFirstClass = context.getBean("myThirdBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());

		System.out.println("4. ================From Bean 4=========================");
		myFirstClass = context.getBean("myFourthBean", MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());


		MyFirstService myFirstService = context.getBean(MyFirstService.class);

		System.out.println("5. ==================Dev Environment =================================");
		System.out.println(myFirstService.readServerPort());
		System.out.println(myFirstService.getMyProperty());
		System.out.println(myFirstService.getMyCustomizedProperty());


		System.out.println("6. ===================================================");

		System.out.println(myFirstService.greetEveryone());


		System.out.println("7. ================Java Version and OS Name==================================");

		System.out.println(myFirstService.getJavaVersion());

		System.out.println(myFirstService.getOsName());

		System.out.println("8. =========================================================");

//		System.out.println(myFirstService.getMyCustomPropertyFromAnotherFile());
//
//		System.out.println("5. ========================================================");
//
//		System.out.println(myFirstService.getAge());
//
//		System.out.println("6. ===========================================================");
//
//		System.out.println(myFirstService.getMyCustomPropertyFromASecondCustomFile());
//
//		System.out.println("7. ========================================================");
//
//		System.out.println(myFirstService.getMeineNummer());
//
//		System.out.println("8. ========================================================");

//		System.out.println("9. ========================================================");
	}
}