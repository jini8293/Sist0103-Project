package day0105;

import java.util.Scanner;

public class QuizeOper_14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String name, tt;
		int sc;

		System.out.println("이름을 입력해주세요.");
		name = s.nextLine();
		System.out.println("자바 시험점수를 입력해주세요.");
		sc = s.nextInt();

		if (sc >= 90) {
			tt = "매우잘함";
		} else if (sc >= 80) {
			tt = "잘함";
		} else if (sc >= 70) {
			tt = "좀더 노력";
		} else {
			tt = "꽝!!";
		}

		tt = (sc >= 90) ? "매우잘함" : (sc >= 80) ? "잘함" : (sc >= 70) ? "노력하세여" : "꽝!";

		System.out.println("\n==============================");
		System.out.println(name + "님의 시험평가는 " + tt + " 입니다.");
		System.out.println("==============================");

	}

}
