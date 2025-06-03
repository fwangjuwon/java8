package org.example.optional;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        // ✅ Optional 만들기

        // Optional.of(T value): 무조건 "값이 있어야만" 만들어진다.
        // 값이 null이면 에러(NullPointerException) 발생!
        Optional<String> optional1 = Optional.of("apple");

        // Optional.ofNullable(T value): 값이 있을 수도, 없을 수도 있음
        // null을 넣어도 에러 안 나고, 빈 Optional을 만들어준다.
        Optional<String> optional2 = Optional.ofNullable(null);

        // Optional.empty(): 빈 Optional을 직접 만들 때 사용
        Optional<String> optional3 = Optional.empty();

        System.out.println("✅ Optional 만들기:");
        System.out.println("optional1: " + optional1);
        System.out.println("optional2: " + optional2);
        System.out.println("optional3: " + optional3);

        // ✅ 값이 있는지 확인하기
        System.out.println("\n✅ 값이 있는지 확인하기:");
        System.out.println("optional1 isPresent: " + optional1.isPresent());
        System.out.println("optional2 isPresent: " + optional2.isPresent());
        System.out.println("optional3 isEmpty: " + optional3.isEmpty()); // Java 11부터 사용 가능!

        // ✅ 값 가져오기 (주의: 값이 없으면 에러!)
        System.out.println("\n✅ 값 가져오기:");
        if (optional1.isPresent()) {
            System.out.println("optional1의 값: " + optional1.get());
        }

        // 아래 주석 해제하면 에러 발생!
//        System.out.println(optional2.get()); // 값이 없어서 NoSuchElementException 발생!

        // ✅ ifPresent(Consumer): 값 있으면 출력하기
        System.out.println("\n✅ ifPresent:");
        optional1.ifPresent(value -> System.out.println("optional1에 있는 값: " + value));
        optional2.ifPresent(value -> System.out.println("optional2에 있는 값: " + value));

        // ✅ orElse: 값 없으면 기본값 사용
        System.out.println("\n✅ orElse:");
        String result1 = optional1.orElse("기본값");
        String result2 = optional2.orElse("기본값");
        System.out.println("optional1: " + result1);
        System.out.println("optional2: " + result2);

        // ✅ orElseGet(Supplier): 값 없으면 함수 실행
        System.out.println("\n✅ orElseGet:");
        String result3 = optional1.orElseGet(() -> "새로 생성한 값");
        String result4 = optional2.orElseGet(() -> "새로 생성한 값");
        System.out.println("optional1: " + result3);
        System.out.println("optional2: " + result4);

        // ✅ orElseThrow(): 값 없으면 예외 던지기
        System.out.println("\n✅ orElseThrow:");
        String result5 = optional1.orElseThrow();
        System.out.println("optional1: " + result5);
        // 아래 주석 해제하면 예외 발생!
//        String result6 = optional2.orElseThrow();

        // ✅ filter: 값 조건 검사
        System.out.println("\n✅ filter:");
        Optional<String> filtered = optional1.filter(value -> value.startsWith("a"));
        System.out.println("optional1 filter a로 시작? " + filtered);

        // ✅ map: 값 변환
        System.out.println("\n✅ map:");
        Optional<Integer> mapped = optional1.map(String::length);
        System.out.println("optional1의 길이: " + mapped);

        // ✅ flatMap: Optional 안에 Optional이 있을 때 편리
        System.out.println("\n✅ flatMap:");
        Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("banana"));
        System.out.println("중첩된 Optional: " + nestedOptional);

        Optional<String> flattened = nestedOptional.flatMap(inner -> inner);
        System.out.println("flatMap으로 펼치기: " + flattened);
    }
}
