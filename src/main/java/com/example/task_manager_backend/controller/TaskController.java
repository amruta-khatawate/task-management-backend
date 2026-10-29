package com.example.task_manager_backend.controller;


import com.example.task_manager_backend.model.Task;
import com.example.task_manager_backend.service.TaskService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
       return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id){
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTaskById(@PathVariable int id){
        boolean result = taskService.deleteTaskById(id);
        if(result){
            return "Deleted Successfully.";
        }
        else{
            return "Task not found!";
        }
    }
    @PostMapping("/{id}")
    public void addTask(@PathVariable int id){

    }
}
