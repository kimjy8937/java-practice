package com.greedy.comprehensive.persistence;

import com.greedy.comprehensive.domain.Todo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoRepository {
    private final TodoStorage todoStorage;
    private final List<Todo> todoList;

    public TodoRepository(TodoStorage todoStorage) {
        this.todoStorage = todoStorage;
        this.todoList = todoStorage.loadTodos();
    }

    public List<Todo> selectTodayTodos() {
        LocalDate today = LocalDate.now();

        return todoList.stream()
                .filter(todo -> todo.getDate().equals(today))
                .sorted(Comparator.comparing(Todo::getIsCompleted)
                        .thenComparing(todo -> todo.getPriority().ordinal())
                )
                .collect(Collectors.toList());
    }

    public List<Todo> selectTomorrowTodos() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        return todoList.stream()
                .filter(todo -> todo.getDate().equals(tomorrow))
                .sorted(Comparator.comparing(Todo::getIsCompleted)
                        .thenComparing(todo -> todo.getPriority().ordinal())
                )
                .collect(Collectors.toList());

    }

    public List<Todo> selectThisWeekTodos() {
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate endOfWeek = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        return todoList.stream()
                .filter(todo -> !todo.getDate().isBefore(startOfWeek) && !todo.getDate().isAfter(endOfWeek))
                .sorted(Comparator.comparing(Todo::getIsCompleted)
                        .thenComparing(todo -> todo.getPriority().ordinal())
                )
                .collect(Collectors.toList());
    }

    public List<Todo> selectThisMonthTodos() {
        LocalDate today = LocalDate.now();
        YearMonth currentMonth = YearMonth.from(today);
        LocalDate startOfMonth = currentMonth.atDay(1);
        LocalDate endOfMonth = currentMonth.atEndOfMonth();

        return todoList.stream()
                .filter(todo -> !todo.getDate().isBefore(startOfMonth) && !todo.getDate().isAfter(endOfMonth))
                .sorted(Comparator.comparing(Todo::getIsCompleted)
                        .thenComparing(todo -> todo.getPriority().ordinal())
                )
                .collect(Collectors.toList());
    }

    public List<Todo> selectAllTodos() {
        return todoList.stream()
                .sorted(Comparator.comparing(Todo::getIsCompleted)
                        .thenComparing(todo -> todo.getPriority().ordinal())
                )
                .collect(Collectors.toList());
    }



    public void insertTodo(Todo todo) {
        todoList.add(todo);
        todoStorage.saveTodos(todoList);
    }

    public void deleteTodo(int no) {
        todoList.removeIf(todo -> todo.getNo() == no);
        todoStorage.saveTodos(todoList);
    }

    public void toggleTodoCompleted(int no) {
        for (Todo todo : todoList) {
            if (no == todo.getNo()) {
                todo.toggleCompleted();
                System.out.println("상태 변경 완료: " + todo);
                return;
            }
        }
        System.out.println("해당 Todo를 찾을 수 없습니다.");
    }
}
