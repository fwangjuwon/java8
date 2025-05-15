package org.example;

public class Greeting {

    private String  name;

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name){
        return "hello" + name;
    }

    public static hi(String name){
        return "hi" + name;
    }
}
