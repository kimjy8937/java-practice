package com.greedy.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for(int i = 7; i < chars.length; i++){
            chars[i] = '*';
        }
        System.out.println(chars);
    }
}
