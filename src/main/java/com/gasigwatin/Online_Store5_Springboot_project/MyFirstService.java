package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {



//2. Bean Injection using a FIELD
//    @Autowired
//    @Qualifier("bean2")

    private MyFirstClass myFirstClass;

    @Value("${my.custom.property}")
    private String myCustomPropertyFromAnotherFile;

    @Value("${my.custom.property.int}")
    private Integer age;


    public String getMyCustomPropertyFromAnotherFile() {
        return myCustomPropertyFromAnotherFile;
    }


    public MyFirstClass getMyFirstClass() {
        return myFirstClass;
    }


    public Integer getAge() {
        return age;
    }


//    private Environment environment;

//1. Bean Injection using a CONSTRUCTOR (which is the recommended way to perform bean injection)

    public MyFirstService(
            @Qualifier("bean3")
            MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

//3. Bean Injection using a METHOD

//    @Autowired
//    public void injectDependencies(
//            @Qualifier("bean4")
//            MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

//4. Bean Injection using a Setter

//    @Autowired
//    public void setMyFirstClass(
//            @Qualifier("bean4")
//            MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }
// Let's create a setter for the Environment and RETURN the environment

//    @Autowired
//    public Environment setEnvironment(Environment environment) {
//        return this.environment = environment;
//    }

//  Now let's get the Java Version

//    public String getJavaVersion(){
//        return environment.getProperty("java.version");
//    }

//    Now let's get the OS Name

//    public String getOsName(){
//        return environment.getProperty("os.name");
//    }

//    Now let's read the application name

//    public String readServerPort(){
//        return environment.getProperty("server.port");
//    }

    public String greetEveryone(){
        return "The bean is greeting everyone saying: " + myFirstClass.sayHello();
    }
}
