package day0109;

import java.util.Scanner;

public class ArrDatainOut_12 {

	public static void main(String[] args) {

		// 배열 생성후 생성한 만큼의 입력 출력
		Scanner s = new Scanner(System.in);

		int[] data;
		data = new int[5];

		int sum = 0;

		// 값 입력
		for (int i = 0; i < data.length; i++) {
			System.out.print((i + 1) + "번째 값: ");
			data[i] = s.nextInt();
			sum += data[i];
		}
		System.out.println();

		// 값 출력
		System.out.println("**입력값 확인**");
		for (int i = 0; i < data.length; i++) {
			System.out.println(i + "==>" + data[i]);
		}
		System.out.println("============================");
		System.out.println("총 합계: " + sum);

	}

}
