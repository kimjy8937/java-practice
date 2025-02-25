package com.greedy.io.level01.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = scanner.nextLine();
        try (FileReader fileReader = new FileReader(fileName)) {
            char[] carr = new char[(int) new File(fileName).length()];
            fileReader.read(carr);
            System.out.println("===== 파일 내용 출력 =====");
            for (char c : carr) {
                System.out.print(c);
            }
        }catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
