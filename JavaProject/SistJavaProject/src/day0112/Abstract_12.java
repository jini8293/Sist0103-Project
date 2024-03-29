package day0112;

import java.util.Scanner;

abstract class Board {
	public abstract void play();
}// Board

class Insert extends Board {

	@Override
	public void play() {
		System.out.println("입력합니다");

	}

}// Insert

class Select extends Board {

	@Override
	public void play() {
		System.out.println("출력합니다");
	}

}// Select

class Update extends Board {

	@Override
	public void play() {
		System.out.println("수정합니다");
	}

}// Update

class Delete extends Board {

	@Override
	public void play() {
		System.out.println("삭제합니다");
	}

}// Delete

public class Abstract_12 {

	public static void main(String[] args) {
		//다형성으로 메서드 출력
		/*
		 * Board board =null;
		 * 
		 * board = new Insert(); board.play();
		 * 
		 * board = new Select(); board.play();
		 * 
		 * board = new Update(); board.play();
		 * 
		 * board = new Delete(); board.play();
		 */

		Scanner s = new Scanner(System.in);

		int num = 0;
		Board board = null;

		while (true) {
			System.out.println("1. 쓰기\t2. 조회\t3. 수정\t4. 삭제\t5. 그 외 숫자 종료");
			num = s.nextInt();

			switch (num) {
			case 1: {
				board = new Insert();
				break;
			}
			case 2: {
				board = new Select();
				break;
			}
			case 3: {
				board = new Update();
				break;
			}
			case 4: {
				board = new Delete();
				break;
			}

			default:
				System.out.println("종료합니다");
				System.exit(0);//강제종료
			}
			board.play();
		}
	}
}
