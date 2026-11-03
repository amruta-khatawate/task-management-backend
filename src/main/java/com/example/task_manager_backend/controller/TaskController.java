package com.example.task_manager_backend.controller;


import com.example.task_manager_backend.model.Task;
import com.example.task_manager_backend.service.TaskService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable int id){
        if(taskService.existsById(id)){
            return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable int id){
            taskService.deleteTaskById(id);
            return new ResponseEntity<>( HttpStatus.OK);
        
    }

    @PostMapping()
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        Task savedtask = taskService.createTask(task);
        return new ResponseEntity<>(savedtask, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTaskById(@PathVariable int id, @RequestBody Task task){

        Task updatedTask = taskService.updateTaskById(id, task);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK);
    }
}
