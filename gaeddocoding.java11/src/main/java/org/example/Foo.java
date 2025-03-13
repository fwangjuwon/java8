package org.example;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {

     Plus100 plus100 = new Plus100();
     plus100.apply(100);

        Function<Integer,Integer> multiply2 = (i)-> i*2;
        plus100.compose(multiply2); //compose에 파라미터로 함수를 넘긴거임
        //+100.compose(*2)
        //어떤 값이 들어오면 먼저 *2하고 거기에다가 +100 하는거다.
        //함수 안에 함수 넣은거임
        System.out.println(plus100.compose(multiply2).apply(3));

        plus100.andThen(multiply2); //이거는 먼저 +100 하고 그 결과값을 이어서 *2를 하게 됨.
        System.out.println(plus100.andThen(multiply2).apply(2));

        // Function<T, R>: 입력값을 변환하여 반환
        Function<Integer, String> functionExample = num -> "숫자: " + num;
        System.out.println(functionExample.apply(10));

        // BiFunction<T, U, R>: 두 개의 입력값을 받아 변환 후 반환
        BiFunction<Integer, Integer, Integer> biFunctionExample = (a, b) -> a + b;
        System.out.println("덧셈 결과: " + biFunctionExample.apply(5, 7));

        // Consumer<T>: 입력값을 받아 처리하지만 반환값 없음
        Consumer<String> consumerExample = message -> System.out.println("메시지: " + message);
        consumerExample.accept("Hello, World!");

        // Supplier<T>: 입력값 없이 값을 반환
        Supplier<Double> supplierExample = () -> Math.random();
        System.out.println("랜덤 값: " + supplierExample.get());

        // Predicate<T>: 입력값을 받아 조건 검사 후 true/false 반환
        Predicate<Integer> predicateExample = num -> num % 2 == 0;
        System.out.println("10은 짝수인가? " + predicateExample.test(10));
        System.out.println("7은 짝수인가? " + predicateExample.test(7));

        // UnaryOperator<T>: 동일한 타입의 입력을 받아 동일한 타입으로 반환
        UnaryOperator<Integer> unaryOperatorExample = num -> num * num;
        System.out.println("제곱 결과: " + unaryOperatorExample.apply(4));

        // BinaryOperator<T>: 동일한 타입의 두 개의 입력을 받아 동일한 타입으로 반환
        BinaryOperator<Integer> binaryOperatorExample = (a, b) -> a * b;
        System.out.println("곱셈 결과: " + binaryOperatorExample.apply(3, 5));
    }
}
