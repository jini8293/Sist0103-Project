package day0108;

import java.util.Scanner;

public class QuizForWhle_15 {

	public static void test1() {

		// 1. 1~100까지의 3의 배수 구하기

		int n = 0;
		int cnt = 0;

		while (true) {
			n++; // 0이였으니 1 증가시킴
			if (n % 3 == 0) {
				cnt++;
			}
			if (n == 100) {
				break;
			}
		}
		System.out.println("3의 배수 갯수는 " + cnt + "개");

	}

	public static void test2() {
		// 2.while문 이용 1~100까지의 짝수 합 구하기

		int n = 0;
		int cnt = 0;

		while (true) {
			n++;
			if (n % 2 == 1) {
				continue;
			}
			cnt += n;
			if (n == 100) {
				break;
			}
		}
		System.out.println("1~100까지 짝수의 합은 " + cnt);

	}

	public static void test3() {
		// 3.for문 이용 1~100까지의 홀수 합 구하기

		int a;
		int cmd = 0;

		for (a = 1; a <= 100; a += 2) {
			cmd += a;

		}
		System.out.println("1~100까지 홀수의 합은 " + cmd);

	}

	public static void test4() {
		// 4. 1번 점수 :90 2번점수 :-70 입력시 잘못입력했어요 하고 다시 2번점수 입력하게

		Scanner s = new Scanner(System.in);

		int a, b;
		int tot = 0;

		for (a = 1; a <= 5; a++) {
			System.out.print(a + "번점수: ");
			b = s.nextInt();
			if (b < 0 || b > 100) {
				System.out.println("\t잘못입력했어요");
				a--;
				continue;
			}
			tot += b;

		}

		System.out.println("총점: " + tot);

	}

	public static void main(String[] args) {

		// test1();
		// test2();
		// test3();
		test4();

	}

}
