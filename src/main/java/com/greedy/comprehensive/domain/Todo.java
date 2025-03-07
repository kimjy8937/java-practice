package com.greedy.comprehensive.domain;

import java.io.Serializable;
import java.time.LocalDate;
/* 불변 객체의 형태로 관리
* setter 제거 후 update 메소드만 사용
* */
public class Todo implements Serializable {
    private int no;
    private String todo;
    private LocalDate date;
    private boolean isCompleted;
    private Priority priority;


    public Todo(int no, String todo, LocalDate date, Priority priority) {
        this.no = no;
        this.todo = todo;
        this.date = date;
        this.priority = priority;
        this.isCompleted = false;
    }

    public void toggleCompleted() {
        this.isCompleted = !isCompleted;
    }

    public int getNo() { return no; }
    public String getTodo() { return todo; }
    public LocalDate getDate() { return date; }
    public boolean getIsCompleted() { return isCompleted; }
    public Priority getPriority() { return priority; }


    @Override
    public String toString() {
        return  (isCompleted ? "O " : "X ") +
                no + ". " +
                todo +
                ", 날짜 =" + date +
                ", 주요도 = " + (priority == Priority.H ? "HIGH" : (priority == Priority.M ? "MEDIUM" : "LOW"));
    }
}
