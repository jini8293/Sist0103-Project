package day0112;

class Color {

	public void hello() {
		System.out.println("안녕하세요!");
	}

}// Color

class Red extends Color {
	
	public void process() {
		System.out.println("나의 차는 빨강이야");
	}

}// Red

class Green extends Color {
	
	public void process() {
		System.out.println("나의 차는 초록이야");
	}

}// Green

class Blue extends Color {
	
	public void process() {
		System.out.println("나의 차는 파랑이야");
	}

}// Blue

class Pink extends Color {
	
	public void process() {
		System.out.println("나의 차는 핑크야");
	}

}// Pink

public class Inherit_09 {

	public static void main(String[] args) {
		
		//자식 클래스로 선언
		System.out.println("1. Red로 선언하고 Red로 생성한 경우");
		Red red =new Red();
		red.hello();
		red.process();
		
		System.out.println("2. Green로 선언하고 Green로 생성한 경우");
		Green green =new Green();
		green.hello();
		green.process();
		
		System.out.println("3. Red로 선언하고 Red로 생성한 경우");
		Blue blue =new Blue();
		blue.hello();
		blue.process();
		
		System.out.println("4. Red로 선언하고 Red로 생성한 경우");
		Pink pink =new Pink();
		pink.hello();
		pink.process();
		
		//부모로 선언하고 자식 클래스로 생성
		//부모가 가지고있는 메소드 호출 ok
		//메서드가 오버라이드 된 경우 호출ok
		//부모한텐 없고 자식만 갖고있는 경우 메서드 호출안됨!!!
		/*color = color;
		color = new Red;
		
		color.hello();*/

	}

}// Inherit_09
