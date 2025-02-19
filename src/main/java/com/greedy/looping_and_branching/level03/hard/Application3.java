package com.greedy.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) < 65 || input.charAt(i) > 122){
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                return;
            }else if(input.charAt(i) > 90 && input.charAt(i) < 97){
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                return;
            }
        }

        System.out.print("문자 입력 : ");
        char ch = sc.next().charAt(0);

        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("포한된 갯수 : "+count);

    }
}
