package org.example;

import java.util.Arrays;
import java.util.List;

public class streamanymatch {
    public static void main(String[] args) {
        // 샘플 데이터: 과일 목록
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi", "avocado", "grape");

        // 6️⃣ anyMatch: "k"로 시작하는 과일이 있는지?
        System.out.println("\n6️⃣ anyMatch - k로 시작하는 과일 있음?");
        boolean hasKFruit = false;
        for (String fruit : fruits) {
            if (fruit.startsWith("k")) {
                hasKFruit = true;
                break;
            }
        }
        System.out.println(hasKFruit);

        //stream anymatch
        boolean haveFruit = fruits.stream().anyMatch(fruit -> fruit.startsWith("k"));
        System.out.println(haveFruit);
    }
}
