package com.greedy.collection.level01.basic;

import java.util.*;


public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> urls = new LinkedList<>();


        while(true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();
            if (url.equals("exit")) {
                break;
            }
            urls.addFirst(url);
            System.out.println(urls);
        }
        sc.close();
    }
}
