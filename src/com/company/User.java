package com.company;

public class User {

    // Fields
    public String name;
    public int age;

    public  User (String name,int age){
        this.name = name;
        this.age = age;
    }

    // Methodes

    public  void sayHello() {
        System.out.println("hi " + this.name + " now you are "+ this.age);
    }


}
