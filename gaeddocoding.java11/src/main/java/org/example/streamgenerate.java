package org.example;

import java.util.Random;
import java.util.stream.Stream;

public class streamgenerate {
    public static void main(String[] args) {

        // 4️⃣ generate / iterate는 과거 방식에서는 직접 루프 돌려야 함!
        System.out.println("\n4️⃣ generate/iterate - 10부터 1씩 증가, 5개:");
        int num = 10;
        for (int i = 0; i < 5; i++) {
            System.out.println(num++);
        }

        System.out.println("stream iterate사용하기");
        Stream.iterate(10, n -> n+1)
                        .limit(5)
                                .forEach(System.out ::println);

        System.out.println("stream generate 사용해서 랜덤숫자 5개 뽑기");
        Stream.generate(()-> new Random().nextInt(100))
                .limit(5)
                .forEach(System.out ::println);

    }
}
