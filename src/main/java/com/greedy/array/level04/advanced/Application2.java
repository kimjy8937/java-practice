package com.greedy.array.level04.advanced;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        Stack<Integer> stk = new Stack<>();
        int count = 10;
        int stackCount = 0;

        // 중복되지 않는 4개의 난수 생성
        while(stackCount < 4) {
            int randomNum = (int) (Math.random() * 10);
            if(stk.isEmpty()){
                stk.push(randomNum);
                stackCount++;
            }else if(stk.peek() != randomNum) {
                stk.push(randomNum);
                stackCount++;
            }
        }
        // 4개의 난수 정수배열로 생성
        for (int i = 0; i < 4; i++) {
            nums[i] = stk.pop();
            System.out.println(nums[i]);
        }

        // 10번 카운트 돌면서 4자리 숫자 입력받기
        while(count != 0){
            int strikeCount = 0;
            int ballCount = 0;
            System.out.printf("%d회 남으셨습니다\n", count);
            System.out.print("4자리 숫자를 입력하세요 : ");
            int n = sc.nextInt();

            //strike, ball 체크
            for (int i = 0; i < 4; i++) {
                System.out.println((int)(n / Math.pow(10, 3-i)));
                System.out.println(nums[i]);

                if ((int)(n / Math.pow(10, 3-i)) == nums[i]) {
                    strikeCount++;
                } else{
                    for(int j = 0; j < 4; j++){
                        if((int)(n / Math.pow(10, 3-i)) == nums[j]){
                            ballCount++;
                        }
                    }
                }
                n = (int)(n % Math.pow(10, 3-i));
            }
            if(strikeCount == 4){
                System.out.println("정답입니다.");
                return;
            }
            System.out.printf("아쉽네요 %dS %dB 입니다.\n", strikeCount, ballCount);
            count--;
        }
    }

}