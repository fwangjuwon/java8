package org.example.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class timeapi {
    public static void main(String[] args) {

        //오늘 날자
        LocalDate today = LocalDate.now();
        System.out.println("오늘은?" + today);

        //현재 시간
        LocalTime time = LocalTime.now();
        System.out.println("지금 몇시?" + time);

        //현재 날짜와 시간
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("현재 일시" + dateTime);

        //타임스탬프
        Instant timestamp = Instant.now();
        System.out.println("기계용 시간" + timestamp);


        // 서울 시간
        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("서울 시간: " + seoul);

        // 날짜 차이
        Period period = Period.between(LocalDate.of(2020, 7, 15), LocalDate.now());
        System.out.println("날짜 차이(Period): " + period.getDays() + "일");

        // 시간 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println("포맷된 날짜: " + LocalDate.now().format(formatter));

        //파싱
        LocalDate parse = LocalDate.parse("1990년 11월 13일", formatter);
        System.out.println(parse);

    }
}
