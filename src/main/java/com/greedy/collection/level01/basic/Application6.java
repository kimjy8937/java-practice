package com.greedy.collection.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }else if(input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String key = sc.nextLine();
                if (map.containsKey(key)) {
                    System.out.println(key + "씨의 전화번호 : " + map.get(key));
                }else {
                    System.out.println(key + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            }else {
                String[] split = input.split(" ");
                if(split.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    continue;
                }
                String key = split[0];
                String value = split[1];
                map.put(key, value);
                System.out.println("추가완료 : " + key + " " + value);
            }
        }
        sc.close();
    }
}
