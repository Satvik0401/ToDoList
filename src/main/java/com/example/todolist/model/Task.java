package com.example.todolist.model;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Task{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	Long id;
	String title;
	String description;
	boolean status;
	
	public Task() {} 
	
	public Task(Long id, String title, String description, boolean status)
	{
		this.description=description;
		this.id=id;
		this.status=status;
	}
	
	//getters
	public Long getId() {return id;}
	public String gettitle() {return title;}
	public String getdescription() {return description;}
	public boolean isstatus() {return status;}
	
	//setters
    public void settitle(String title) {this.title=title;}
    public void setdescription(String description) {this.description=description;}
    public void setstatus(boolean status) {this.status=status;}
    
}
