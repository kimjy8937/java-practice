package com.greedy.api.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        int wordCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word, 1, word.length());
            wordCount++;
            if(wordCount != words.length)
                sb.append(" ");
        }

        System.out.println("변환된 문자열 : " + sb);
        System.out.println("총 단어 개수 : " + wordCount);


    }
}