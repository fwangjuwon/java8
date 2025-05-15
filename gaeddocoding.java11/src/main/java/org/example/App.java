package org.example;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo("juwon");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
