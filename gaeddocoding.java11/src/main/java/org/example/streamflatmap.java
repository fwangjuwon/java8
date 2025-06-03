package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class streamflatmap {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 3️⃣ flatMap 비슷한 것: 중첩 리스트 펼치기
        System.out.println("\n3️⃣ flatMap - 중첩된 리스트 펼치기:");
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D", "E")
        );
        for (List<String> innerList : nestedList) {
            for (String letter : innerList) {
                System.out.println(letter);
            }
        }
        System.out.println("stream flatmap사용하기");
        nestedList.stream().flatMap(Collection::stream)
                .forEach(System.out ::println);

    }
}
