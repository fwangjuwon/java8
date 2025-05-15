package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("juwon");
        name.add("whiteship");
        name.add("bokrae");
        name.add("foo");

        name.forEach(System.out::println);
    }
}
