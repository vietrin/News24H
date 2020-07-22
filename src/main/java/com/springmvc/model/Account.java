package com.springmvc.model;

public class Account {
	private String email, password, name;
	private int role;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String email, String password, String name, int role) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
