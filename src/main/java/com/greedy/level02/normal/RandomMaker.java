package com.greedy.level02.normal;
import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    public static String randomUpperAlphabet(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('A' + randomNumber(0, 26)));
        }
        return sb.toString();
    }
    public static String rockPaperScissors() {
        String[] choices = {"가위", "바위", "보"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }
    public static String tossCoin() {
        String[] choices = {"앞면", "뒷면"};
        Random random = new Random();
        return choices[random.nextInt(2)];
    }
}
