package day0105;

import java.util.Scanner;

public class OperTest_04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a, b;

		System.out.println("두수를 입력해주세요 => ");
		a = s.nextInt();
		b = s.nextInt();

		System.out.println("\n[산술연산자결과]");
		System.out.println("더하기: " + (a + b));
		System.out.println("빼기: " + (a - b));
		System.out.println("곱하기: " + (a * b));
		System.out.println("나누기: " + (a / b));
		System.out.println("나누기: " + (double)a / b);
		System.out.println("나머지값: " + (a % b));

	}

}
