package com.gasigwatin.Online_Store5_Springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file.properties")
})

public class MyFirstService {


//2. Bean Injection using a FIELD
//    @Autowired
//    @Qualifier("bean2")

    private final MyFirstClass myFirstClass;

    private Environment environment;

//    Here we are reading from the existing application.properties, so we don't need to use the @PropertySource, because Java detects the file immediately

    @Value("${my.property}")
    private String myProperty;

    @Value("${my.customized.property}")
    private String myCustomizedProperty;

//    Here we are reading from a file we created on our own, so we need to use the @PropertySource
    @Value("${my.custom.property}")
    private String myCustomPropertyFromAnotherFile;

//    Here we are also reading from a file we created; so we need a PropertySource as well

    @Value("${my.custom.property.int}")
    private Integer age;

    @Value("${my.secondcustom.property}")
    private String myCustomPropertyFromASecondCustomFile;

    @Value("${my.secondcustom.property.int}")
    private Integer meineNummer;




//    Here we are creating the GETTERS for all the private fields

    public String getMyProperty() {
        return myProperty;
    }

    public String getMyCustomizedProperty() {
        return myCustomizedProperty;
    }

    public String getMyCustomPropertyFromAnotherFile() {
        return myCustomPropertyFromAnotherFile;
    }

    public Integer getAge() {
        return age;
    }

    public String getMyCustomPropertyFromASecondCustomFile() {
        return myCustomPropertyFromASecondCustomFile;
    }

    public Integer getMeineNummer() {
        return meineNummer;
    }


    public MyFirstClass getMyFirstClass() {
        return myFirstClass;
    }



//    private Environment environment;

//1. Bean Injection using a CONSTRUCTOR (which is the recommended way to perform bean injection)

    public MyFirstService(
            @Qualifier("myFirstBean")
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

    @Autowired
    public Environment setEnvironment(Environment environment) {
        return this.environment = environment;
    }

//  Now let's get the Java Version

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

//    Now let's get the OS Name

    public String getOsName(){
        return environment.getProperty("os.name");
    }

//    Now let's read the application Server Port

    public String readServerPort(){
        return environment.getProperty("server.port");
    }

    public String greetEveryone(){
        return "The bean is greeting everyone saying: " + myFirstClass.sayHello();
    }
}
