package org.example;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        //콜론이 두개 찍혀 있으면 메소드레퍼런스다.
        //스태틱이 아니라 인스턴스를 사용해야한다면 메소드레퍼런스를 사용하는것!!

        /*람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해서
        매우 간결하게 표현할 수 있다.
        */
        String[] names = {"keesun", "whiteship", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
