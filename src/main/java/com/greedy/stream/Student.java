package com.greedy.stream;

public class Student {

    private String name;
    private String subject;
    private int score;

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }
}