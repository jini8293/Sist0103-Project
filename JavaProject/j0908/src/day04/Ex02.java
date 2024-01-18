package day04;

//추상 클래스:자기 자신은 아무 것도 하지않는 추상화 된 클래스 (예약어 abstract)
//추상클래스를 상속받은 서브클래스는 반드시 추상클래스의 추상메서드를 구현해줘야함
//추상클래스는 자기 자신을 객체화할 수 없음
abstract class Shape{
	//아무것도 정의되지 않은 메서드: 추상메서드(예약어 abstract를 사용해야함)
	//추상메서드는 일반클래스에 선언 불가함 == 추상클래스에 선언
	public abstract void draw();
	
	public abstract void Area(double a, double b);
}

class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그리는 기능");
	}

	@Override
	public void Area(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("사각형의 면적은 = "+(a*b));	
	}
}

class Triangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그리는 기능");
	}

	@Override
	public void Area(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 면적은 = "+(a*b)/2);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 자기 자신을 객체화 할 수 없다(반드시 상속 받은 자식클래스로 부터 객체화)
		//Shape s = new Shape(); //안됨
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		Shape[] s = {s1, s2};
		
		for(int i=0; i<s.length; i++) {
			s[i].draw();
			s[i].Area(5.0, 5.0);
		}

	}
}
