package com.greedy.collection.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        while(true) {
            System.out.println("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();
            if(input.equals("exit")) {
                break;
            }
            set.add(input);
        }
        sc.close();
        System.out.println("정렬 된 단어 : " + set);
    }
}
