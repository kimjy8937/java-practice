package com.greedy.comprehensive.ui;


import com.greedy.comprehensive.domain.Priority;
import com.greedy.comprehensive.domain.Todo;
import com.greedy.comprehensive.persistence.FileTodoStorage;
import com.greedy.comprehensive.persistence.TodoRepository;
import com.greedy.comprehensive.service.TodoService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/* 실행 및 UI */
public class Application {
    private final TodoService todoService;
    private final Scanner scanner;
    private static final AtomicInteger todoCounter = new AtomicInteger(1);

    public Application() {
        TodoRepository todoRepository = new TodoRepository(new FileTodoStorage());
        this.todoService = new TodoService(todoRepository);
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\n===== 할일 관리 프로그램 =====");
            System.out.println("1. 오늘 할일 조회");
            System.out.println("2. 내일 할일 조회");
            System.out.println("3. 이번 주 할일 조회");
            System.out.println("4. 이번 달 할일 조회");
            System.out.println("5. 모든 할일 조회");
            System.out.println("6. 할일 등록");
            System.out.println("7. 할일 완료체크/체크해제");
            System.out.println("8. 할일 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> showTodayTodos();
                    case 2 -> showTomorrowTodos();
                    case 3 -> showThisWeekTodos();
                    case 4 -> showThisMonthTodos();
                    case 5 -> showAllTodos();
                    case 6 -> registerTodo();
                    case 7 -> checkTodo();
                    case 8 -> removeTodo();
                    case 9 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }



    private void checkTodo() {
        System.out.print("체크/체크 해제할 할일 번호 입력: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        todoService.updateTodoStatus(no);
    }


    private void showAllTodos() {
        todoService.getAllTodos().forEach(System.out::println);
    }
    private void showTodayTodos() {
        List<Todo> todos = todoService.getTodayTodos();
        if(todos.isEmpty()) {
            System.out.println("오늘 할일이 등록되어 있지 않습니다.");
        }
        todos.forEach(System.out::println);
    }
    private void showThisWeekTodos() {
        List<Todo> todos = todoService.getThisWeekTodos();
        if(todos.isEmpty()) {
            System.out.println("이번 주 할일이 등록되어 있지 않습니다.");
        }
        todos.forEach(System.out::println);
    }
    private void showThisMonthTodos() {
        List<Todo> todos = todoService.getThisMonthTodos();
        if(todos.isEmpty()) {
            System.out.println("이번 달 할일이 등록되어 있지 않습니다.");
        }
        todos.forEach(System.out::println);
    }
    private void showTomorrowTodos() {
        List<Todo> todos = todoService.getTomorrowTodos();
        if (todos.isEmpty()) {
            System.out.println("내일 할일이 등록되어 있지 않습니다.");
        }
        todos.forEach(System.out::println);
    }

    private void registerTodo() {
        try {
            System.out.print("할일 입력: ");
            String todo = scanner.nextLine();

            System.out.print("날짜 입력 (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(scanner.nextLine()); // 날짜 입력받아 파싱

            System.out.print("중요도 입력 (HIGH(H), MEDIUM(M), LOW(L)) : ");
            Priority priority = Priority.fromString(scanner.nextLine());

            int nextUserNo = todoCounter.getAndIncrement();
            Todo newTodo = new Todo(nextUserNo, todo, date, priority);

            todoService.registerTodo(newTodo);
            System.out.println("할일 등록 완료 : " + todo);

        }catch (DateTimeParseException e) {
            System.out.println("날짜 입력 형식이 잘못되었습니다. (예: 2025-03-07)");
        } catch (IllegalArgumentException e) {
            System.out.println("할일 등록 실패: " + e.getMessage());
        }
    }


    private void removeTodo() {
        try {
            System.out.print("삭제할 할일 번호 입력: ");
            int no = scanner.nextInt();
            scanner.nextLine();

            todoService.removeTodo(no);
            System.out.println("할일 삭제 완료 (ID: " + no + ")");

        } catch (IllegalArgumentException e) {
            System.out.println("할일 삭제 실패: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        new Application().run();
    }
}
