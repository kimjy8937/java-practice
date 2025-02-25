package com.greedy.exception.level01.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int num1;
        int num2;

        try {
            System.out.print("분자 입력 : ");
            num1 = scanner.nextInt();
            System.out.print("분모 입력 : ");
            num2 = scanner.nextInt();

            result = num1 / num2;
            System.out.println("결과 : " + result);


        }catch (InputMismatchException e){
            System.out.println("유효한 정수를 입력하세요.");
        }catch (ArithmeticException e) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        }finally {
            System.out.println("실행이 완료되었습니다.");
        }

    }
}
