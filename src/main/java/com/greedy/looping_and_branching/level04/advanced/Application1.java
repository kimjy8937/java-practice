package com.greedy.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String inputStr = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int inputNum = sc.nextInt();

        while(inputNum > 26){
            inputNum -= 26;
        }

        for(int i = 0; i < inputStr.length(); i++){
            if (inputStr.charAt(i) != ' ') {
                if(inputStr.charAt(i) >= 65 && inputStr.charAt(i) <= 90){
                    if(inputStr.charAt(i) + inputNum > 90)
                        System.out.print((char) (inputStr.charAt(i)+inputNum-26) + " ");
                    else
                        System.out.print((char) (inputStr.charAt(i)+inputNum) + " ");
                }else if(inputStr.charAt(i) >= 97 && inputStr.charAt(i) <= 122){
                    if(inputStr.charAt(i) + inputNum > 122)
                        System.out.print((char) (inputStr.charAt(i)+inputNum-26) + " ");
                    else
                        System.out.print((char) (inputStr.charAt(i)+inputNum) + " ");
                }
            }
        }
    }
}
