package day0110;

public class Car {
	String model;
	int speed;

	public Car(String madel) {
		this.model = madel;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		this.setSpeed(100);
		System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"(km/h))");
	}

}
