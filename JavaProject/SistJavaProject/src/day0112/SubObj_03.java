package day0112;

public class SubObj_03 extends SuperObj_03 {

	String addr;

	public SubObj_03(String name, int age, String addr) {
		super(name, age); // 빈드시 첫줄에 부조생성자 호출
		this.addr = addr;
	}

	public SubObj_03() {
		super();
	}

	public void writeData() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("주소: " + this.addr);

	}
}
