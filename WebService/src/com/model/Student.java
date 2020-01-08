package com.model;

public class Student {
	private int studentId;
	private String studentName;
	private double fee;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Student getStudentById(int studentId){
		
		Student student = new Student();
		if (studentId ==10){
			student.setStudentId(10);
			student.setStudentName("Saikrishna");
			student.setFee(50000);
		}
		if (studentId ==20){
			student.setStudentId(10);
			student.setStudentName("Sk");
			student.setFee(50000);
		}
		return student;
		
		
		

	}
}
