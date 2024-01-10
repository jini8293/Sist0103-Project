package day0110;

import java.util.Calendar;

class Test {

	public Test() {
		System.out.println("디폴트 생성자");
	}

	//생성자 대신 인스턴스를 반환해주는 메서드
	public static Test getInstance() {
		return new Test();
	}
	
	public void writeMesage() {
		System.out.println("안녕~~~~~");
	}
	
	
	
	
	
	
	
	
}

public class GetInstance_15 {

	public static void main(String[] args) {

		//Test t1 = new Test();
		
		//클래스명.getInstance()
		Test t1 =  Test.getInstance();
		
		t1.writeMesage();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		
		System.out.println(year+"년도");
		
		
	}

}
