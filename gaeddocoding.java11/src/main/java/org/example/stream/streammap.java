package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class streammap {

    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 2️⃣ map: 대문자로 변환하기
        System.out.println("\n2️⃣ map - 대문자로 변환:");
        for (String fruit : fruits) {
            System.out.println(fruit.toUpperCase());
        }

        System.out.println("stream map 사용하기");
        fruits.stream().map(String::toUpperCase).forEach(System.out ::println);

    }
}
