package day11;

import java.util.HashMap;
import java.util.Scanner;

//클래스 요소에 클래스를 통해 이름을 받아 클래스의 값을 찾아오기

class Student{
	private int id; //학번
	private String tel; //전화번호
	public Student(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	
}

public class ex02 {
	public static void main(String[] args) {
		//hashMap을 이용해서 3명의 학생을 저장
		//찾고싶은 사람의 이름을 입력받아 그 학생의 학번과 전화번호를 출력
		//exit 입력받으면 종료 (기말고사에 출제되는 문제)
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("홍길동", new Student(20192164, "01012121212"));
		hm.put("김기명", new Student(20191111, "01033333333"));
		hm.put("박형석", new Student(20192222, "01044444444"));
		while(true) {
			Scanner s = new Scanner(System.in);
			String name = s.next();
			if(name.equals("exit"))
				break;
			
			Student stud = hm.get(name);
			
			if(stud==null)
				System.out.println("없는 이름");
			else {
			System.out.println("이름: "+name+" 전화번호: "+stud.getTel()+" 학번:"+stud.getId());
			}
		}
		
	}

}
