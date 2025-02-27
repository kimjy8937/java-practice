package com.greedy.collection.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputCheck = 'y';
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (inputCheck == 'y') {
            System.out.print("학생 성적 : ");
            list.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            inputCheck = sc.next().charAt(0);
        }
        sc.close();

        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("학생인원 : " + list.size());
        System.out.println("평균점수 : " + (double)(sum / list.size()));
    }
}
