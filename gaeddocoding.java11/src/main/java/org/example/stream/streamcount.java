package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class streamcount {
    public static void main(String[] args) {

        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");
        // 7️⃣ count: 길이가 6 이상인 과일 개수
        System.out.println("\n7️⃣ count - 길이 6 이상 과일 개수:");
        int count = 0;
        for (String fruit : fruits) {
            if (fruit.length() >= 6) {
                count++;
            }
        }
        System.out.println(count);

        //stream count
        long streamcount= fruits.stream().filter(fruit->fruit.length()>=6).count();
        System.out.println(streamcount);
    }
}
