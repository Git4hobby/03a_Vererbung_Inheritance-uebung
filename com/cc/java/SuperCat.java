package com.cc.java;

// Klasse
public class SuperCat {
    
    private String firstName;
    private String furColor;
    protected int age;
    
    // Constructor
    public SuperCat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

   /** Getter */
   protected String getStringAttributes(String op) {
    switch (op) {
      case "#name":
          return firstName;
      case "#color":
          return furColor;
      default:
          return "ERROR";
    }
  }
}