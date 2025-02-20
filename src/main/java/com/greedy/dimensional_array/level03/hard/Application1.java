package com.greedy.dimensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int h;
        int w;
        while(true){
            System.out.print("가로 행의 수를 입력하세요 : ");
            h = sc.nextInt();
            if(h < 1 || h > 10){
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else{
                break;
            }
        }
        while(true){
            System.out.print("세로 행의 수를 입력하세요 : ");
            w = sc.nextInt();
            if(w < 1 || w > 10){
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }else{
                break;
            }
        }
        char[][] darr = new char[h][w];

        for (int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                darr[i][j] = (char) ((char)random.nextInt(26) + 65);
                System.out.print(darr[i][j] + " ");
            }
            System.out.println();
        }
    }
}