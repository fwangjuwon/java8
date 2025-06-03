package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class streamfilter {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 1️⃣ 걸러내기: 글자수가 5글자 이상인 과일만 고르기
        System.out.println("1️⃣ filter - 5글자 이상 과일:");
        for (String fruit : fruits) {
            if (fruit.length() >= 5) {
                System.out.println(fruit);
            }
        }

        //stream filter로 만들어보기
        System.out.println("1️⃣ (stream) filter - 5글자 이상 과일:");
        fruits.stream().filter(fruit -> fruit.length() >=5)
                .forEach(System.out::println);

    }
}
