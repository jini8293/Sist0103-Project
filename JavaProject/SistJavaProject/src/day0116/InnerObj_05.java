package day0116;

class Outer {

	String name = "조혜영";
	int age = 22;

	// member 내부 1
	class Inner1 {
		// 내부클래스에서는 외부클래스의 멤버변수사용이 가능하다
		void disp() {
			System.out.println("**Inner1 내부 클래스**");
			System.out.println("이름: " + name + ", 나이: " + age + "세");

		}
	}

	// member 내부 2
	class Inner2 {
		void disp2() {
			System.out.println("**Inner2 내부 클래스**");
			System.out.println("이름: " + name + ", 나이: " + age + "세");

		}
	}

	void write() {
		// 외부메서드에서 내부클래스 선언
		Inner1 in1 = new Inner1();
		in1.disp();

		Inner2 in2 = new Inner2();
		in2.disp2();

	}

}

public class InnerObj_05 {

	public static void main(String[] args) {

		// 외부 생성
		Outer out = new Outer();
		out.write();
		System.out.println("-------------------------------------------------------");
		System.out.println("다른 클래스에서 외부 통하지 않고 직접 내부클래스 메서드 호출하고 싶다면?");
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();

		Outer.Inner2 in2 = out.new Inner2();
		in2.disp2();
	}

}
