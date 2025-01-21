package com.cc.java;
// Verweiß / Ausweitung zur Supercat
public class Cat extends SuperCat {

    private int counter;

    // constructor
    public Cat(String firstName, String furColor, int age) {
        super(firstName,furColor,age);
 
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
