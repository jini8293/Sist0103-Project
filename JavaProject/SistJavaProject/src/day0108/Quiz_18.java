package day0108;

import java.util.Scanner;

public class Quiz_18 {

	public static void quiz_1() {

		// 1. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오(0입력시 종료)
		Scanner s = new Scanner(System.in);

		int n;
		int cnt = 0, tot = 0;

		while (true) { // 무한루프라 브레이크줘야함
			System.out.println();
			n = s.nextInt();
			if (n == 0) {
				break;
			}
			if (n < 0) {
				cnt++;
			} else {
				tot++;
			}

		}
		System.out.println("양수의 갯수 " + cnt + "개");
		System.out.println("음수의 갯수 " + tot + "개");

	}

	public static void quiz_2() {
		// 2. 반복해서 점수를 입력하고 (1~100) 0을 입력시 빠져나와 갯수와 합계와 평균을 구하시오
		Scanner s = new Scanner(System.in);
		int a;
		int cnt = 0, tot = 0;

		while (true) {
			System.out.print("점수 입력(1~100): ");
			a = s.nextInt();
			if (a == 0) {
				break;
			}
			if (a < 0 || a >= 100) {
				System.out.println("\t잘못입력했어요(1~100)");
				continue;
			}
			cnt += a;
			tot++;
		}
		double pp = (double) cnt / tot;
		System.out.println("합계: " + cnt);
		System.out.println("갯수: " + tot);
		System.out.printf("평균:%.1f", pp);

	}

	public static void quiz_3() {

	}

	public static void main(String[] args) {

		quiz_1();
		// quiz_2();

	}

}
