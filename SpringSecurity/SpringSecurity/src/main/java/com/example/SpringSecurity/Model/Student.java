package com.example.SpringSecurity.Model;

public class Student {
	
	private int studId;
	private String Name;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return Name;
	}
	public Student(int studId, String name) {
		super();
		this.studId = studId;
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", Name=" + Name + "]";
	}
	public void setName(String name) {
		Name = name;
	}
	
}
