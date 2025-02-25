package com.greedy.exception.level01.basic;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate inputDate;
        try{
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String date = scanner.nextLine();
            inputDate = LocalDate.parse(date);
        }catch(DateTimeException e){
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
            return;
        }

        LocalDate now = LocalDate.now();
        LocalDate allowDate = LocalDate.of(now.getYear()-21, now.getMonth(), now.getDayOfMonth());

        System.out.println(allowDate);

        if (inputDate.isBefore(allowDate)) {
            System.out.println("입장하셔도 됩니다.");
        }else if (inputDate.isAfter(allowDate)) {
            System.out.println("만 20세 미만은 입장 불가입니다.");
        }

    }
}
