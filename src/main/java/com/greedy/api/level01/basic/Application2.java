package com.greedy.api.level01.basic;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Application2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ') {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String[] words = sb.toString().split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String maxKey = "";
        int maxValue = 0;
        System.out.println("=====단어 빈도=====");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("가장 빈도 높은 단어 : " + maxKey + "(" + maxValue + "번)");
    }
}