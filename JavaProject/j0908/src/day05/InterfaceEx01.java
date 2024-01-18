package day05;
//인터페이스 : 디자인만 있는, 선언된 메서드들로 구성된 클래스
//1. 멤버변수 메서드 생성자는 올 수 없다
//2. 예외 : final 상수값, default 메서드는 가능
//3. 자기 자신을 객체화 할 수 없다 == 상속받은 하위클래스가 반드시 아무 것도 정의되지 않은 메서드를 오버라이딩
//4. 유일하게 다중상속이 가능
//5. 상속 명령어 : extends가 아니라 implements
interface Remote{
	//인터페이스에선 껍데기만 있기 때문에 abstract 선언이 필요 없음
	public void turnon();
	public void turnoff();
}

class Television implements Remote{
	@Override
	public void turnon() {
		System.out.println("텔레비전이 켜짐");
	}
	
	@Override
	public void turnoff() {
		System.out.println("텔레비전이 꺼짐");
	}
}

class Refrigerator implements Remote{

	@Override
	public void turnon() {
		// TODO Auto-generated method stub
		System.out.println("냉장고 켜짐");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("냉장고 꺼짐");
	}
	
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote r1 = new Television();
		Remote r2 = new Refrigerator();
		Remote[] r = {r1, r2};
		for(Remote list:r) 
			list.turnon();
		
			r1.turnoff();
	}

}
