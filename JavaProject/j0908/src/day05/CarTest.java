package day05;
//클래스 Car : 속도조절 메서드
//인터페이스 : Flying, Driving
//클래스 : FlyCar(Car, Flying, Driving 다중상속)
class Car{
	public void setSpeed(int speed) {
		System.out.println("자동차의 속도가 "+speed+"km로 변경되었습니다.");
	}
}

interface Flying{
	public void fly();
}

interface Driving{
	final int speed=100;
	default public void speedUP() {
		System.out.println("고속도로 주행="+speed+"로 세팅되어 있습니다.");
	}
	public void drive();
}

class FlyCar extends Car implements Flying, Driving{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 달리고 있습니다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 날고 있습니다.");
	}
	
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyCar car = new FlyCar();
		car.drive();
		car.setSpeed(30);
		car.speedUP();
		car.fly();
		car.setSpeed(200);
		
	}

}
