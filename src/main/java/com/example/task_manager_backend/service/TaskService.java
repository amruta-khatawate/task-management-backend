package com.example.task_manager_backend.service;


import com.example.task_manager_backend.model.Task;
import com.example.task_manager_backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
       return taskRepository.findAll();
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id).get();
    }

    public void deleteTaskById(int id) {
        taskRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return taskRepository.existsById(id);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
