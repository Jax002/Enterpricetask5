
package com.example.enterpricetasc5;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskService();

        Task task1 = new Task("Example task 1", "Description task 1", new Date(), Priority.HIGH);
        Task task2 = new Task("Example task 2", "Description task 2", new Date(), Priority.MEDIUM);

        taskService.createTask(task1);
        taskService.createTask(task2);

        System.out.println("All task:");
        taskService.getAllTasks().forEach(System.out::println);

        System.out.println("Change status task 1:");
        taskService.changeTaskStatus(task1.getId(), Status.IN_PROGRESS);
        taskService.getAllTasks().forEach(System.out::println);
    }
}
