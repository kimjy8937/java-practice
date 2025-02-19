package com.greedy.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = scanner.nextLine();
        switch (fruit){
            case "사과":
                System.out.println("사과의 가격은 1000원 입니다.");
                break;
            case "바나나":
                System.out.println("바나나의 가격은 3000원 입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 2000원 입니다.");
                break;
            case "키위":
                System.out.println("키위의 가격은 5000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }

    }
}
