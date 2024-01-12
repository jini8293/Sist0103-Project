package day0112;

//interface는 상수(final)와 추상메서드(abstract)만 가질 수 있다.
//class가 class를  : extends
//class가 interface를 : implements -->가장많이함
//interface가 interface를 : extends
interface FoodShop {

	final String SHOPNAME = "남소관";// final 생략가능

	abstract void order();// abstract 생략가능

	public void beadal();

}// FoodShop

class Food2 implements FoodShop {

	@Override
	public void order() {
		// SHOPNAME="왕돈까스"; ->상수만 인식함 수정 불가
		System.out.println("음식을 주문합니다");

	}

	@Override
	public void beadal() {
		System.out.println("음식을 배달합니다");

	}

}// Food

class Food3 implements FoodShop {

	@Override
	public void order() {
		System.out.println("키오스크 주문");

	}

	@Override
	public void beadal() {
		System.out.println("쿠팡이츠 배달");

	}

}// Beadal

public class Implement_13 {

	public static void main(String[] args) {
		
		//다형성으로 출력
		FoodShop fs;
		fs=new Food2();
		fs.order();
		fs.beadal();
		
		fs=new Food3();
		fs.order();
		fs.beadal();

	}

}
