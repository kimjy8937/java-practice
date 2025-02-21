package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int grade;
        int classroom;
        String name;
        int kor;
        int eng;
        int math;
        int avg;

        for (int i = 0; i < 10; i++) {
            System.out.print("학년 : ");
            grade = sc.nextInt();
            System.out.print("반 : ");
            classroom = sc.nextInt();
            System.out.print("이름 : ");
            name = sc.next();
            System.out.print("국어점수 : ");
            kor = sc.nextInt();
            System.out.print("영어점수 : ");
            eng = sc.nextInt();
            System.out.print("수학점수 : ");
            math = sc.nextInt();

            students[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            String answer = sc.next();
            if (!answer.equals("y")) {
                break;
            }
        }
        for (int i = 0; students[i] != null; i++) {
            avg = (students[i].getKor() + students[i].getEng() + students[i].getMath()) / 3;
            System.out.println(students[i].getInformation() + ", 평균=" + avg);
        }
    }
}
