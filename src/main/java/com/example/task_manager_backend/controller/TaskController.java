package com.example.task_manager_backend.controller;


import com.example.task_manager_backend.model.Task;
import com.example.task_manager_backend.service.TaskService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String greet(){
        return "Shri harivansh";
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
       return taskService.getAllTasks();
    }
}
