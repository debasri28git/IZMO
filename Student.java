package com.dm.model;

import java.util.Arrays;

public class Student {
    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", mode=" + mode + ", subjects="
				+ Arrays.toString(subjects) + "]";
	}
	private int id;
	private String name;
	private String address;
	private String mode;
	private String subjects[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getSubjects() {
		String s="";
		for(String x:subjects)
			s+=x+" ";
		return s;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 }
