package org.example;

import java.util.function.Function;

public class Plus100 implements Function<Integer, Integer>{
    //1번째 파라미터가 입력값의 타입, 2번재 파라미터가 출력값의 타입

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
