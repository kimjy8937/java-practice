package com.greedy.array.level04.advanced;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums;
        Set<Integer> hs = new HashSet<>();
        int count = 10;
        Random random = new Random();


        // 중복되지 않는 4개의 난수 생성
        while (hs.size() < 4) {
            hs.add(random.nextInt(10)); // 0~9 사이의 난수
        }
        // 4개의 난수 정수배열로 생성
        nums = hs.stream().mapToInt(Integer::intValue).toArray();

        // 10번 카운트 돌면서 4자리 숫자 입력받기
        while(count != 0){
            int strikeCount = 0;
            int ballCount = 0;
            System.out.printf("%d회 남으셨습니다\n", count);
            System.out.print("4자리 숫자를 입력하세요 : ");
            int n = sc.nextInt();

            //strike, ball 체크
            for (int i = 0; i < 4; i++) {
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