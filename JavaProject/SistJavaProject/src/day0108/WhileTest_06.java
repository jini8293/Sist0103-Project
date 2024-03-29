package day0108;

import java.util.Scanner;

public class WhileTest_06 {

	public static void main(String[] args) {
		// 1~10까지 반복 출력

		int n = 0;

		while (n < 10) {
			n++;
			System.out.printf("%4d", n);
		}

		System.out.println();

		n = 0;

		while (n < 10) {
			System.out.printf("%4d", ++n);
		}

		System.out.println();

		n = 0;
		while (true) { // 수행문장에 반드시 break문으로 조건문을 써주어야한다
			System.out.printf("%4d", ++n);
			if (n == 10) {
				break;
			}

		}
	}
}
