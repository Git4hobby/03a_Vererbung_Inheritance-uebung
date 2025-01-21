package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung + Wertzuweisung
        Cat cat = new Cat("Grizabella", "white", 29);

        // Werte über Getter
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
        
        output("-----------------------");

        Tomcat tomcat = new Tomcat("Alonzo", "grey", 35);

        // Werte über Getter
        output(tomcat.getStringAttributes("#name"));
        output(tomcat.getStringAttributes("#color"));
        output(tomcat.getAge());

    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

