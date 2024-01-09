package day0109;

import java.util.Scanner;

public class ArrMaxNum_13 {

	public static void main(String[] args) {

		int[] data = { 12, 4, 123, 54, 45, 88, 99, 65, 32, 98, 155 };
		System.out.println("갯수: " + data.length);

		int max = data[0]; // 첫 데이터를 무조건 최대값에 지정
		int min = data[0];

		// 두번째 데이터 부터 끝까지 max와 비교
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			if (min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최소값: " + min);

	}

}
