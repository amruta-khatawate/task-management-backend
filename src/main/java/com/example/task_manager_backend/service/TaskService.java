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

//    List<Task> list = new ArrayList<>(
//           new Task(1, "task1", "Personal", "High", '2026-01-01', "Description", "Pending", '2026-01-02');
//    );

    public List<Task> getAllTasks() {
//            return list;
       return taskRepository.findAll();
    }
}
