package com.example.todolist.controller;

import com.example.todolist.model.*;
import com.example.todolist.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController{
	@Autowired
	private TaskService taskService;
	
	//Get all tasks
	@GetMapping
	public List<Task> getAllTasks(){
		return taskService.getAllTasks();
	}
	
	//get task by id
	@GetMapping("/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable("id"))
}