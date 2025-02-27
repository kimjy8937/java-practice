package com.greedy.collection.level01.basic;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while(true){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();
            if(input.equals("exit")) {
                break;
            }else if(input.equals("next")) {
                if(queue.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                    break;
                }else{
                    System.out.println(queue.poll()+ " 고객님 차례입니다.");
                }
            }else{
                queue.offer(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }
        sc.close();
    }
}

