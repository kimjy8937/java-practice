package com.greedy.comprehensive.service;

import com.greedy.comprehensive.domain.Todo;
import com.greedy.comprehensive.persistence.TodoRepository;
import java.util.List;


public class TodoService {
    private final TodoRepository todoRepository;


    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodayTodos() {
        return todoRepository.selectTodayTodos();
    }

    public List<Todo> getTomorrowTodos() {
        return todoRepository.selectTomorrowTodos();
    }

    public List<Todo> getThisWeekTodos() {
        return todoRepository.selectThisWeekTodos();
    }

    public List<Todo> getThisMonthTodos() {
        return todoRepository.selectThisMonthTodos();
    }

    public void updateTodoStatus(int no) {
        todoRepository.toggleTodoCompleted(no);
    }


    public void registerTodo(Todo todo) {
        todoRepository.insertTodo(todo);
    }


    public void removeTodo(int no) {
        todoRepository.deleteTodo(no);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.selectAllTodos();
    }
}


