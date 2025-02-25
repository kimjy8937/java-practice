package com.greedy.io.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originName = scanner.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyName = scanner.nextLine();

        try(FileReader fileReader = new FileReader(originName)) {
            char[] carr = new char[(int) new File(originName).length()];
            fileReader.read(carr);
            try (FileWriter fileWriter = new FileWriter(copyName)) {
                for (char c : carr) {
                    fileWriter.write(c);
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + originName + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
