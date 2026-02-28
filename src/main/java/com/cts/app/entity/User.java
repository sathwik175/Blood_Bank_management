package com.cts.app.entity;

public class User {
	private int id;
	private String email;
	private String username;
	private String mobile;
	private String bloodgroup;
	private String gender;
	private int age;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String email, String username, String mobile, String bloodgroup, String gender, int age,
			String password) {
		super();
		this.email = email;
		this.username = username;
		this.mobile = mobile;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.age = age;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", mobile=" + mobile + ", bloodgroup="
				+ bloodgroup + ", gender=" + gender + ", age=" + age + ", password=" + password + "]";
	}
	
	
	
	
}
