package com.day02;

import java.util.ArrayList;
import java.util.Scanner;

//Person 클래스 정의: 이름(name), 전화번호(tel) : 접근제한
//모든 값을 초기화하는 생성자 정의
//toString() 재정의 출력
//ArrayList 배열 클래스를 사용하여 3명의 이름과 전화번호를 입력 받아 저장하고 출력

class Person{
	private String name;
	private String tel;
	
	public Person(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + "]";
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Person> p = new ArrayList<Person>();
		
		for(int i=0; i<3; i++) {
			System.out.print("이름과 전화번호 입력:");
			String name=s.next();
			String tel=s.next();

			p.add(new Person(name,tel));
			
			
		}
		
		for(Person list:p) {
			System.out.println(list);
		}

		

	}

}
