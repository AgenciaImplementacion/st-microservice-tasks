package com.ai.st.microservice.tasks.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreateTaskDto implements Serializable {

	private static final long serialVersionUID = 8405437490199078160L;

	private String name;
	private String description;
	private String deadline;
	private List<Long> users;
	private List<Long> categories;

	public CreateTaskDto() {
		this.users = new ArrayList<Long>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public List<Long> getUsers() {
		return users;
	}

	public void setUsers(List<Long> users) {
		this.users = users;
	}

	public List<Long> getCategories() {
		return categories;
	}

	public void setCategories(List<Long> categories) {
		this.categories = categories;
	}

}