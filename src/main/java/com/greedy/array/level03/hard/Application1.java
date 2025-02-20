package com.greedy.array.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        if(n % 2 == 0 || n <= 0){
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < n/2)
                arr[i] = i+1;
            else
                arr[i] = n-i;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}