package com.example.todolist.service;

import com.example.todolist.model.Task;
import com.example.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp1 implements TaskService
{
	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task addTask(Task task)
	{
	 return taskRepository.save(task);
	}
	
	@Override
	public List<Task> getAllTasks()
	{
		return taskRepository.findAll();
	}
	
	@Override
	public Task updateTask(Long id, Task taskDetails)
	{
		Optional<Task> optionalTask=taskRepository.findById(id);
		if(optionalTask.isPresent())
		{
			Task task=optionalTask.get();
			task.settitle(taskDetails.gettitle());
			task.setstatus(taskDetails.isstatus());
			return taskRepository.save(task);
		}
		else 
		{
			return null;
		}
    }
	@Override
	public Task getTaskById(Long id) {
		return taskRepository.findById(id).orElse(null);
	}
	@Override
	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
	}
}