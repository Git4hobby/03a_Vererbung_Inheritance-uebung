package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;

    private int counter;

    // constructor
    public Cat(String firstName, String furColor, int age) {
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
            return checkCompliance();   
    }

    
    private String checkCompliance(){

       counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; // 1st time
            case 2:
                return "I've told you once!"; // 2nd time
            case 3:
                return "Talk to the hand!"; // 3rd time 
            default:
                return "Wie oft noch du Stupid catty Cat"; //4th ++
        }

    }
}
