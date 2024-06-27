package com.example.task_manager.service;

import com.example.task_manager.model.Task;
import com.example.task_manager.model.User;
import com.example.task_manager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserService userService;

    public TaskService(TaskRepository taskRepository, UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

    public Task save(Task task) {
        var user = this.userService.findById(task.getUser().getId());
        task.setUser((User) user);
        return this.taskRepository.save(task);
    }


    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }

    public Task findById(String id) {
        return this.taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public void completed(String id) {
        var task = this.findById(id);
        task.setCompleted(true);
        this.save(task);
    }

    public void delete (String id) {
        this.taskRepository.deleteById(id);
    }
}
