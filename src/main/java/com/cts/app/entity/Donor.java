package com.cts.app.entity;

public class Donor {
	private int id;
	private String name;
	private String bloodGroup;
	private int units;
	private String mobile;
	private String gender;
	private int age;
	private String city;
	private String address;
	private String date;
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
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public Donor(int id, String name, String bloodGroup, int units, String mobile, String gender, int age, String city,
			String address, String date) {
		super();
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.units = units;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
		this.city = city;
		this.address = address;
		this.date = date;
	}
	public Donor() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + ", units=" + units + ", mobile="
				+ mobile + ", gender=" + gender + ", age=" + age + ", city=" + city + ", address=" + address + ", date="
				+ date + "]";
	}
	
}
