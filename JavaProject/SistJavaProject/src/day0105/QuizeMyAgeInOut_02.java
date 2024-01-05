package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizeMyAgeInOut_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		String name, area;
		int year, age;

		System.out.print("당신의 이름은?==>");
		name = s.nextLine();

		System.out.print("당신이 태어난 연도는?==>");
		year = Integer.parseInt(s.nextLine());

		System.out.print("당신이 사는 지역은?==>");
		area = s.nextLine();

		int cy = c.get(c.YEAR);
		age = cy - year;

		System.out.println("\n=========================");
		System.out.println("[" + name + " 님의 개인정보]");
		System.out.println("=========================");

		System.out.println("이름: " + name);
		System.out.println("태어난년도: " + year);
		System.out.println("나이: " + age);
		System.out.println("지역: " + area);

	}

}
