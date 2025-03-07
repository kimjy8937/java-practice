package com.greedy.comprehensive.persistence;

import com.greedy.comprehensive.domain.Todo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTodoStorage implements TodoStorage {
    private static final String FILE_PATH = "src/main/java/com/greedy/comprehensive/db/todoDB.dat";

    @Override
    public void saveTodos(List<Todo> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류 발생", e);
        }
    }

    @Override
    public List<Todo> loadTodos() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Todo>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("할일 목록을 모두 로딩하였습니다.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("파일 로딩 중 오류 발생", e);
        }
    }
}
