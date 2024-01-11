package day0111;

class Apple {

	public Apple() {
		System.out.println("Apple_디폴트 생성자");
	}

}// Apple

class Banana {

	public Banana(String str) {
		System.out.println("생성자 호출: " + str);
	}

}// Banana

class Orange {

	// 생성자 오버로딩
	public Orange() {
		System.out.println("Orange의 디폴트 생성자 호출");
	}

	public Orange(String str) {
		System.out.println("Oranged의 2번째 생성자: " + str);
	}

	public Orange(int n) {
		this(); // 기본생성자 호출, 반드시 첫줄이여야함
		System.out.println("Oranged의 3번째 생성자: " + n);
	}

}// Orange

public class ConstTest_02 {

	public static void main(String[] args) {

		Apple apple = new Apple();
		Banana banana = new Banana("바나나");
		Orange orange = new Orange();
		Orange orange2 = new Orange();
		Orange orange3 = new Orange("오렌지");

	}

}
