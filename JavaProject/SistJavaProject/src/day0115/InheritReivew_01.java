package day0115;

interface InterAA {

	public void play();

}// InterAA

interface InterBB {

	public void draw();

}// InterBB

class InterImple implements InterAA, InterBB {

	@Override
	public void draw() {

		System.out.println("나는 그림을 그린다");

	}

	@Override
	public void play() {

		System.out.println("나는 게임을 한다");

	}

}// InterImple

public class InheritReivew_01 {

	public static void main(String[] args) {

		InterImple impl = new InterImple();
		impl.draw();
		impl.play();
		
		System.out.println("**다형성으로 출력**");
		InterAA aa = new InterImple();
		aa.play();
		
		InterBB bb = new InterImple();
		bb.draw();
		
	}

}
