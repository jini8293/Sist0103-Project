package day0108;

import java.util.Calendar;
import java.util.Scanner;

public class OperReview_02 {

	public static void main(String[] args) {

		// 띠: 로직에서 사용하는 순서는 원숭이 부터
		// 원숭이 닭 쥐 솟 호랑이 토끼 용 뱀 말 양 개 돼지

		Scanner s = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		String name, ddi;
		int mB, age;

		System.out.println("이름을 입력하세요.");
		name = s.nextLine();
		System.out.println("출생 년도를 입력하세요.");
		mB = s.nextInt();

		age = c.get(c.YEAR) - mB;

		ddi = mB % 12 == 0 ? "원숭이"
				: mB % 12 == 1 ? "닭"
						: mB % 12 == 2 ? "개"
								: mB % 12 == 3 ? "돼지"
										: mB % 12 == 4 ? "쥐"
												: mB % 12 == 5 ? "소"
														: mB % 12 == 6 ? "호랑이"
																: mB % 12 == 7 ? "토끼"
																		: mB % 12 == 8 ? "용"
																				: mB % 12 == 9 ? "뱀"
																						: mB % 12 == 10 ? "말" : "양";

		System.out.println(name + "님의 나이는 " + age + " 띠는 " + ddi + "입니다.");

	}

}
