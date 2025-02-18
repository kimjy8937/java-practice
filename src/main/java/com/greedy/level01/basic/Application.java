package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println("1부터 10까지 합: " + calculator.sum1to10());
        calculator.checkMaxNumber(10, 20);
        System.out.printf("%d와 %d의 합은 : %d\n", 10, 20, calculator.sumTwoNumber(10,20));
        System.out.printf("%d와 %d의 차는 : %d", 10, 20, calculator.minusTwoNumber(10,5));
    }
}
