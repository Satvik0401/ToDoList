package com.example.todolist.service;
import java.util.List;
import com.example.todolist.model.Task;

public interface TaskService{
	Task addTask(Task task);
	List<Task> getAllTasks();
	Task getTaskById(Long id);
	Task updateTask(Long id, Task task);
	void deleteTask(Long id);
}