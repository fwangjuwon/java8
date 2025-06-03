package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamcollect {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 9️⃣ collect: 길이 5 이상 과일을 새로운 List로 모으기
        System.out.println("\n9️⃣ collect - 5글자 이상 과일 리스트로:");
        List<String> longFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() >= 5) {
                longFruits.add(fruit);
            }
        }
        System.out.println(longFruits);

        //stream collect
        List<String> streamFruits = fruits.stream().filter(fruit->fruit.length() >= 5).collect(Collectors.toList());
        System.out.println(streamFruits);

    }
}
