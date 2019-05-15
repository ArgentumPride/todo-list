package ua.pride.service;

import ua.pride.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> todoList();
    Todo save(Todo todo);
    Todo findById(Long id);
    Todo update(Todo todo);
    void delete(Long id);
}
