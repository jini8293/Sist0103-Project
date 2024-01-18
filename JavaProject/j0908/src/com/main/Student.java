package com.main;

public class Student{
	private String name;
	private int kor, math, eng;
	private double avg;
	private char grade;
	
	public Student(String name, int kor, int math, int eng) {
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name+"/"+avg+"/"+grade+"학점";
	}
	
	
}

