package day0105;

import java.util.Scanner;

public class QuizeOper_07 {

	public static void main(String[] args) {
		// 여러분이 받은 알바비를 입력한후 만원,천원,백원,십원,일원의 갯수를 출력

		Scanner s = new Scanner(System.in);

		int pay;

		System.out.print("알바비는? => ");
		pay = s.nextInt();

		System.out.println("만원: " + pay / 10000);
		System.out.println("천원: " + (pay % 10000) / 1000);
		System.out.println("백원: " + (pay % 1000) / 100);
		System.out.println("십원: " + (pay % 100) / 10);
		System.out.println("일원: " + pay % 10);

	}

}
