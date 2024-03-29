package day0115;

abstract class Game {

	abstract public void play();

	abstract public void stop();

}// Game

class Kim extends Game {

	@Override
	public void play() {
		System.out.println("kim게임 시작");

	}

	@Override
	public void stop() {
		System.out.println("kim게임 종료");

	}

}// Kim

class Lee extends Game {

	@Override
	public void play() {
		System.out.println("Lee게임 시작");

	}

	@Override
	public void stop() {
		System.out.println("Lee게임 종료");

	}

}// Lee

class Choi extends Game {

	@Override
	public void play() {
		System.out.println("Choi게임 시작");

	}

	@Override
	public void stop() {
		System.out.println("Choi게임 종료");

	}

}// Choi

public class AbstractReview_02 {

	public static void main(String[] args) {

		/*
		 * Game g = null;
		 * 
		 * g = new Kim(); g.play(); g.stop();
		 * 
		 * g = new Lee(); g.play(); g.stop();
		 * 
		 * g = new Choi(); g.play(); g.stop();
		 */

		Game[] g = new Game[3];// 선언
		g[0] = new Kim();// 생성
		g[1] = new Lee();
		g[2] = new Choi();

		for (int i = 0; i < g.length; i++) {
			g[i].play();
		}
		System.out.println("===========================");
		for (int i = g.length - 1; i >= 0; i--)
			g[i].stop();
	}

}
