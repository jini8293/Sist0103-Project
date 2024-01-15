package day0115;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

interface Command {
	public void write();
}// Command

class Insert implements Command {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 입력합니다");

	}

}// Insert

class List implements Command {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 출력합니다");

	}

}// List

class Modify implements Command {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 수정합니다");
	}

}// Modify

class Delete implements Command {

	@Override
	public void write() {
		System.out.println("게시판에 게시물을 삭제합니다");

	}

}// Delete

public class inheritBoard_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Command com = null;

		int n;
		exit: while (true) {
			System.out.println("1.추가\t2.출력\t3.수정\t4.삭제\t5.프로그램 종료");
			System.out.print("=======>");
			n = s.nextInt();

			switch (n) {
			case 1:
				com = new Insert();
				break;
			case 2:
				com = new List();
				break;
			case 3:
				com = new Modify();
				break;
			case 4:
				com = new Delete();
				break;
			default:
				System.out.println("종료합니다");
				// System.exit(0);//강제종료
				break exit; // while문을 빠져나가는 강제종료 문
			}
			if (n <= 4) {
				com.write();
				System.out.println("-----------------------------------");
			}else {
				break;
			}
		}

	}
}
