package org.example;

import java.util.Arrays;
import java.util.List;

public class streamreduce {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");
        // 8️⃣ reduce: 모든 과일 이름을 이어붙이기
        System.out.println("\n8️⃣ reduce - 모든 과일 이어붙이기:");
        String combined = "";
        for (String fruit : fruits) {
            combined += " " + fruit;
        }
        System.out.println(combined.trim());

        //stream reduce
        String combinefruits = fruits.stream().reduce("",(a,b)-> a + "+" + b);
        System.out.println(combinefruits);
    }
}
