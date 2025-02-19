package com.greedy.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("체중을 입력하세요 : ");
        double weight = scanner.nextDouble();
        System.out.print("신장을 입력하세요 : ");
        double height = scanner.nextDouble();

        if(weight / (height * height) < 20){
            System.out.println("당신은 저체중 입니다.");
        }else if(weight / (height * height) >= 20 && weight / (height * height) < 25){
            System.out.println("당신은 정상체중 입니다.");
        }else{
            System.out.println("당신은 비만 입니다.");
        }
    }

}
