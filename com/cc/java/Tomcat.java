package com.cc.java;

public class Tomcat {

    private String firstName;
    private String furColor;
    private int age;

    // Constructor
    public Tomcat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */
    public String getStringAttributes(String op) {
      switch (op) {
        case "#name":
            return firstName;
        case "#color":
            return furColor;
        default:
            return "ERROR";
      }
    }

    public String getAge() {
            return Integer.toString(age); 
    }
}
