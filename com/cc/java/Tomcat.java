package com.cc.java;
// Verweiß / Ausweitung zur Supercat
public class Tomcat extends SuperCat {

    // Constructor
    public Tomcat(String firstName, String furColor, int age) {
        super(firstName,furColor,age);
 
    }

    public String getAge() {
            return Integer.toString(age); 
    }
}