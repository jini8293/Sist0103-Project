package day0109;

import java.util.Scanner;

public class WhileReview_03 {

	public static void main(String[] args) {
		/*
		 * 반복적으로 나이를 입력해서 0이되면 종료 나이가 50세 이상일경우 a변수 증가 나이가 30세 이상이면 b변수 증가 그 외에는 c변수 증가
		 * 
		 * 빠져나온후 출력내용 50세 이상: 3명 30세 이상: 2명 그외: 3명
		 */

		Scanner s = new Scanner(System.in);
		int i;
		int a = 0, b = 0, c = 0;

		while (true) {
			System.out.print("나이를 입력하세요(0이면 종료): ");
			i = s.nextInt();
			if (i == 0) {
				break;
			}
			if (i >= 50) {
				a++;
			} else if (i >= 30) {
				b++;
			} else {
				c++;
			}

		}
		System.out.println("50세 이상:" + a + "명");
		System.out.println("30세 이상:" + b + "명");
		System.out.println("그외: " + c + "명");
	}

}
