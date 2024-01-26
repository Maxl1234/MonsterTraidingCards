package com.example.app.task.service;

import com.example.app.task.entity.Task;
import com.example.app.task.repository.DatabaseTaskRepository;
import com.example.app.task.repository.MemoryTaskRepository;
import com.example.app.task.repository.TaskRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Optional<Task> find(int id) {
        return Optional.empty();
    }

    public Task save(Task task) {
        task.setId(UUID.randomUUID().toString());
        return taskRepository.save(task);
    }

    public Task update(int updateId, Task updatedTask) {
        return null;
    }

    public Task delete(Task task) {
        return null;
    }
}
