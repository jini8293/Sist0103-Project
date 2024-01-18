package day03;

import java.util.Scanner;

class Hero1{
	private String name;
	public Hero1(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"이 ";
	}
}

class Heroman extends Hero1{
	private String level;
	public Heroman(String name, String level) {
		super(name);
		this.level=level;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+level+"로 이동";
	}
}




public class HeroTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Hero1[] h = new Hero1[3];
		System.out.println("영웅과 무기를 입력하시오");
		for(int i=0; i<h.length; i++) {
			System.out.print("영웅입력");
			String name = s.next();
			System.out.print("무기입력");
			String level = s.next();
			h[i] = new Heroman(name, level);
		}
	
		for(Hero1 list:h) {
			System.out.println(list);		
			}
	}

}