package org.example;

import java.util.Arrays;
import java.util.List;

public class streamlimit {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 5️⃣ limit & skip: 첫 3개 건너뛰고 그 다음 2개 출력
        System.out.println("\n5️⃣ limit & skip:");
        for (int i = 3; i < 5; i++) {
            System.out.println(fruits.get(i));
        }

        //stream skip, limit
        fruits.stream().skip(3).limit(2).forEach(System.out ::println);

    }
}
