package com.greedy.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int count = 1;
        int input;
        while(true){
            System.out.print("정수를 입력하세요 : ");
            input = sc.nextInt();
            if(randomNumber == input){
                System.out.println("정답입니다. "+count+"회만에 정답을 맞추셨습니다.");
                break;
            }else if(randomNumber > input){
                System.out.println("입력하신 정수보다 큽니다.");
            }else{
                System.out.println("입력하신 정수보다 작습니다.");
            }
            count++;
        }

    }
}
