package day0112;

//추상클래스
//new로 생성 못함
//Abstract 메서드는 Abstract 크래스에서만 존재할 수 있다.
//Abstract 클래스는 일반메서드 추상메서드 둘다 포함 가능

abstract class Fruit {
	public static final String MRSSAGE = "오늘은 추상클래스 배우는날 ~~!";

	// 일반메서드
	public void showTitle() {
		System.out.println("일반메서드 입니다.");
	}

	// 추상메서드/(미완의메서드 구현부가 없다)....오버라이딩이 목적
	abstract public void showMessage();

}// Fruit

class Apple extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MRSSAGE);
		System.out.println("Apple_Message");

	}

}// Apple

class Banana extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MRSSAGE);
		System.out.println("Banana_Message");

	}

}// Banana

class Orange extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MRSSAGE);
		System.out.println("Orange_Message");

	}

}// Orange

public class Abstract_11 {

	public static void main(String[] args) {
		//일반 생성 출력
		Apple apple = new Apple();
		apple.showMessage();
		
		Banana banana = new Banana();
		banana.showMessage();
		
		Orange orange = new Orange();
		orange.showMessage();
		
		//다형성 출력 (부모로 선언, 자식으로 생성)_장점은 변수가 하나
		//부모 클래스명  변수명 = new 자식클래스명
		Fruit fruit=null;
		
		fruit = new Apple();
		fruit.showMessage();
		fruit.showTitle();
		
		fruit = new Banana();
		fruit.showMessage();
		fruit.showTitle();
		
		fruit = new Orange();
		fruit.showMessage();
		fruit.showTitle();
		
		
		

	}

}
