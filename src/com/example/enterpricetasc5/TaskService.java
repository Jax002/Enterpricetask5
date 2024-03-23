package com.example.enterpricetasc5;// TaskService.java

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private Long taskIdCounter = 1L;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task createTask(Task task) {
        task.setId(taskIdCounter++);
        tasks.add(task);
        return task;
    }

    public void changeTaskStatus(Long taskId, Status newStatus) {
        tasks.stream()
                .filter(task -> task.getId().equals(taskId))
                .findFirst()
                .ifPresent(task -> task.setStatus(newStatus));
    }
}