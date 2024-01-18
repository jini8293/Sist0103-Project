package day03;

import java.util.Scanner;

//1. Man 클래스 : 이름(name) 전화번호(tel) => protected 접근제한
//2. 메서드 : 출력을 위한 show() 메서드  정의
//3. 상속 받은 클래스 : Student(학과) BusinessMan(직업) : 생성자 초기화 show() 메서드 오버라이딩

class Man{
	protected String name;
	protected String tel;
	public void show() {
		System.out.print(name+":"+tel);
	}
}


class Student extends Man{
	private String dept;
	public Student(String name, String tel, String dept) {
		super.name=name;
		super.tel=tel;
		this.dept=dept;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("("+dept+")");
	}
}



class BusinessMan extends Man{
	private String job;
	public BusinessMan(String name, String tel, String job) {
		super.name=name;
		super.tel=tel;
		this.job=job;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("("+job+")");
	}
	
}


public class ManTest {

	public static void main(String[] args) {
		Man m1 = new Man();
		Student s = new Student("홍길동", "010-0101-0101", "소프트웨어융합과");
		//Man s = new Student("홍길동", "010-0101-0101", "소프트웨어융합과");
		//Student -> Man 상위로 변경 가능
		BusinessMan b1 = new BusinessMan("김철수", "010-0202-0202", "개발자");
		BusinessMan b2 = new BusinessMan("이영희", "010-0303-0303", "기획자");
		//객체형변환 : 하위 클래스가 상위 클래스로 상향 형변환만 가능(상위 클래스로 부터 상속 받은 서브 클래스를 객체화하여 배열로 처리)
		Man[] ma = {s, b1, b2};
		
		for(Man m:ma) {
			m.show();
		}
		
		
		

	}

}
