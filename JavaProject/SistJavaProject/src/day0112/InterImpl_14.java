package day0112;

interface InterA {

	public void singasong();

	public void draw();

}// InterA

interface InterB extends InterA{

	public void playgame();

	public void write();

}// InterB

class Imple implements InterB{

	@Override
	public void singasong() {
		System.out.println("노래를 부릅니다");

	}

	@Override
	public void draw() {

		System.out.println("그림을 그립니다");
	}

	@Override
	public void playgame() {
		System.out.println("게임을 합니다");

	}

	@Override
	public void write() {
		System.out.println("공부를 합니다");

	}

}// Imple

public class InterImpl_14 {

	public static void main(String[] args) {

		//하위 클래스 생성
		Imple b  =new Imple();
		b.singasong();
		b.draw();
		b.playgame();
		b.write();
		
		//다형성 생성
		InterB inb = new Imple();
		inb.singasong();
		inb.draw();
		inb.playgame();
		inb.write();

	}

}
