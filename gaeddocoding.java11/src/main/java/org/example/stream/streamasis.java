package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamasis {
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

        // 2️⃣ map: 대문자로 변환하기
        System.out.println("\n2️⃣ map - 대문자로 변환:");
        for (String fruit : fruits) {
            System.out.println(fruit.toUpperCase());
        }


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

        // 4️⃣ generate / iterate는 과거 방식에서는 직접 루프 돌려야 함!
        System.out.println("\n4️⃣ generate/iterate - 10부터 1씩 증가, 5개:");
        int num = 10;
        for (int i = 0; i < 5; i++) {
            System.out.println(num++);
        }

        // 5️⃣ limit & skip: 첫 3개 건너뛰고 그 다음 2개 출력
        System.out.println("\n5️⃣ limit & skip:");
        for (int i = 3; i < 5; i++) {
            System.out.println(fruits.get(i));
        }

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

        // 7️⃣ count: 길이가 6 이상인 과일 개수
        System.out.println("\n7️⃣ count - 길이 6 이상 과일 개수:");
        int count = 0;
        for (String fruit : fruits) {
            if (fruit.length() >= 6) {
                count++;
            }
        }
        System.out.println(count);

        // 8️⃣ reduce: 모든 과일 이름을 이어붙이기
        System.out.println("\n8️⃣ reduce - 모든 과일 이어붙이기:");
        String combined = "";
        for (String fruit : fruits) {
            combined += " " + fruit;
        }
        System.out.println(combined.trim());

        // 9️⃣ collect: 길이 5 이상 과일을 새로운 List로 모으기
        System.out.println("\n9️⃣ collect - 5글자 이상 과일 리스트로:");
        List<String> longFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() >= 5) {
                longFruits.add(fruit);
            }
        }
        System.out.println(longFruits);
    }
}
