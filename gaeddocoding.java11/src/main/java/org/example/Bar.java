package org.example;

public interface Bar {

   default void printNameUpperCase() {
        System.out.println("BAR");
    }
}
