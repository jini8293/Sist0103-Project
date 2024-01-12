package day0112;

public class Manager_04 extends Employee_04{
	
	String depart;

	public Manager_04(String name, int sal, String d) {
		super(name, sal); //부모생성자 호출
		this.depart=d; //초기화
	}
	
	//제정의된 메서드_하위클래스에서 부모클래스의 메서드를 수정해서 사용하는 것
	//상속이 전제조건, 메서드명이 동일해야함 return타입이 동일해야함
	@Override
	public String getEmployee() {
		return super.getEmployee()+", "+depart;
	}
	

}
