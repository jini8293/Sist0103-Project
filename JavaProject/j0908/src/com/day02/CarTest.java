package com.day02;

import java.util.Scanner;

class Car{
	private int speed;
	public int milege;
	protected String Color;
	public Car() {
		this.speed=60;
		this.milege=0;
		this.Color="red";
	}
	//색상을 초기화하는 생성자 정의
	public Car(String color) {
		//생성자에서 또 다른 생성자 호출
		this();
		
		//이것만 적으면 car[i] = new Car("white");	로 적었을 때 속도가 10이 됨
		this.Color=color;
	}
	public void setSpeed() {
		speed += 10;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", milege=" + milege + ", Color=" + Color + "]";
	}

}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM = 5;
		
		//원하는 색상을 입력받아 초기화
		Scanner s = new Scanner(System.in);
		
		Car[] car = new Car[NUM];
		//객체를 생성
		for(int i=0; i<car.length; i++) {
			System.out.print("차종의 색상을 고르세요");
			String color=s.next();
			car[i] = new Car(color);	
		}
		for(int i=0; i<car.length; i++) {
			car[i].setSpeed();
		}
		//for~each문 이용하여 출력 for(타입(클래스) 이름:배열이름)
		for(Car list:car) {
			System.out.println(list);
		}
		
		

	}

}
