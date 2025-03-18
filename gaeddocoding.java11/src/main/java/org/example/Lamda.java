package org.example;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Lamda {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;           //body가 1줄 이면 {}생략 가능
        BinaryOperator<Integer>sum = (a,b)-> a+b;

        //변수 캡쳐
        Lamda lamda = new Lamda();
        lamda.run();
    }

    private void run(){
        int baseNumber =10;
        //final을 하면 변경을 못한다. final value는 선언할 때 한번 지정해주면 더이상 바꾸지 못함.
        //사실상 final이라는건 final이라느 키워드는 없지만 어디서든 변경하지 않는 경우 = effective final
        //final없이도 참조가 가능하다. 아래 3개 다

        //로컬 클래스
        class LocalClass{
            void printBaseNumber(){
                int baseNumber =11;
                System.out.println(baseNumber); //결과 = 11 (쉐도잉 된것)
            }
        }

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber); //결과 = 파라미터 (쉐도잉 된 것)
            }
        };

        //람다
        //람다가 위에 두개랑 다른건, 람다는 쉐도잉이 안된다. 위에 두개는 또 다른 스콥이기 때문이다. 람다는 람다를 감싸고 있는 메소드랑 같다.

        IntConsumer printInt = (i) -> {
            System.out.println(i +  baseNumber); //우리가 참조 하고 있는 local 변수가 캡쳐된다. //결과 = 10 (쉐도잉 되지 않음) 같은 스콥이기 때문에 같은 변수 명을 넣을 수 없음
            //익명클래스나 내부 클래스에서도 쓰이는 개념인데, 원래 java8이전엔 메소드 내부에 정의한 클래스는 final을 붙여줘야한다.
        };
        printInt.accept(10);
    }
}
