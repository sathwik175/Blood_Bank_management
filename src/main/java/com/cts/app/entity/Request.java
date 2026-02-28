package com.cts.app.entity;

public class Request {
	private int id;
    private String name;
    private String email;
    private String bloodgroup;
    private int units;
    private String disease;
    private String mobile;
    private String gender;
    private int age;
    private String status;
    private int user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Request(int id, String name, String email, String bloodgroup, int units, String disease, String mobile,
			String gender, int age, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.bloodgroup = bloodgroup;
		this.units = units;
		this.disease = disease;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
		this.status = status;
	}
	public Request() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", name=" + name + ", email=" + email + ", bloodgroup=" + bloodgroup + ", units="
				+ units + ", disease=" + disease + ", mobile=" + mobile + ", gender=" + gender + ", age=" + age
				+ ", status=" + status + "]";
	}
	
	
	
	
	
}
