package day0108;

import java.util.Scanner;

public class ForGugu_14 {

	public static void main(String[] args) {
		// 중첩 for문 이용한 구구단

		for (int i = 2; i <= 9; i++) {
			System.out.print("*** " + i + "단 ***\n");
			for (int n = 1; n <= 9; n++) {
				System.out.println(i + "X" + n + " = " + (i * n));
			}
		}

		// break문을 이용한 구구단
		loop1: for (int i = 2; i <= 9; i++) {
			System.out.print("*** " + i + "단 ***\n");
			for (int n = 1; n <= 9; n++) {
				if (n == 5) {
					// break; //현재의 반복문을 빠져나가 상위의 i++로 이동
					break loop1;// 이름을 명시하여 여러반복문 빠져나가는것도 가능 네이밍:
				}
				System.out.println(i + "X" + n + " = " + (i * n));

			}
			System.out.println();
		}

		Scanner s = new Scanner(System.in);

		int e;
		int i;
		System.out.println("Q. 단을 입력하면 해당단이 나오게 해주세요 [5단]");
		System.out.print("단을 입력해주세요");
		e = s.nextInt();

		// 구구단 출력
		System.out.print("*** " + e + "단 ***\n");

		for (i = 1; i <= 9; i++) {
			System.out.println(e + "X" + i + " = " + (e * i));
		}

		while (true) {
			System.out.print("단을 입력해주세요");
			e = s.nextInt();
			// 종료조건
			if (e == 0) {
				System.out.println("프로그램을 종료");
				break;
			}

			// 잘못입력한 경우
			if (e < 2 || e > 9) {
				System.out.println("2~9단ㄲ지만 입력해주세요");
				continue;
			}

			// 구구단 출력
			System.out.println("*** " + e + "단 ***\n");

			for (i = 1; i <= 9; i++) {
				System.out.println(e + "X" + i + " = " + (e * i));
			}
		}
		System.out.println();

		System.out.print("가로 방향으로 구구단 출력");

		for (int d = 2; d <= 9; d++) {
			System.out.println("[" + d + "단]\t");
		}

		System.out.println();
		System.out.println();

		for (int i1 = 1; i1 <= 9; i1++) {
			for (int d = 2; d <= 9; d++) {
				System.out.print(d + "X" + i1 + "=" + d * i1 + "\t");
			}
			System.out.println();
		}

	}

}
