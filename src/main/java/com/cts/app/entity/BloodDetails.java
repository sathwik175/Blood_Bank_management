package com.cts.app.entity;

public class BloodDetails {
	
	
	private String bloodgroup;
	private int count;
	private int units;
	
	public BloodDetails(String bloodgroup, int count, int units) {
		super();
		this.bloodgroup = bloodgroup;
		this.count = count;
		this.units = units;
	}
	
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	@Override
	public String toString() {
		return "BloodDetails [bloodgroup=" + bloodgroup + ", count=" + count + ", units=" + units + "]";
	}
}
