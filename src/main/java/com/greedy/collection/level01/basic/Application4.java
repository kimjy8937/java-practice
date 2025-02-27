package com.greedy.collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = sc.nextLine();
            if (id.equals("exit")){
                break;
            }
            if(set.contains(id)){
                System.out.println("이미 등록 된 ID입니다.");
            }else{
                set.add(id);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
        sc.close();
        System.out.println("모든 학생의 ID : " + set);
    }
}
