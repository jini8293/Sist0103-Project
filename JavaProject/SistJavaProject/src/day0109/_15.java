package day0109;

import java.util.Scanner;

public class _15 {
	// 학생명과 점수를 입력_몇명인지는 입력해 주는 만큼
	// 입력해준 데이터로 출력을 하고 합계 구하기

	public static void test01() {
		Scanner s = new Scanner(System.in);

		int in;
		String[] name;
		int[] sc;

		int tot = 0;
		double avg = 0;

		System.out.print("인원수를 입력하시오: ");
		in = Integer.parseInt(s.nextLine());

		// 인원수만큼 배열로 할당
		name = new String[in];
		sc = new int[in];

		// 인원수만큼 데이터 입력
		for (int i = 0; i < in; i++) {
			System.out.println(i + "번째 학생이름: ");
			name[i] = s.nextLine();
			System.out.println(i + "번째 학생점수: ");
			sc[i] = Integer.parseInt(s.nextLine());

			// 총점
			tot += sc[i];
		}

		// 계산
		avg = (double) tot / in;

		// 출력
		System.out.println("번호\t이름\t점수");
		System.out.println("=========================");

		for (int i = 0; i < in; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + sc[i]);

		}
		System.out.println("------------------------");
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);

	}

	public static void test02() {

		// 학생명과 점수를 입력_몇명인지는 입력해 주는 만큼
		// 입력해준 데이터로 출력을 하고 합계 구하기

		Scanner s = new Scanner(System.in);

		int in;
		String[] name;
		int[] sc;
		int [] ra;

		int tot = 0;
		double avg = 0;

		System.out.print("인원수를 입력하시오: ");
		in = Integer.parseInt(s.nextLine());

		// 인원수만큼 배열로 할당
		name = new String[in];
		sc = new int[in];
		ra = new int[in];

		// 인원수만큼 데이터 입력
		for (int i = 0; i < in; i++) {
			System.out.println(i + "번째 학생이름: ");
			name[i] = s.nextLine();
			System.out.println(i + "번째 학생점수: ");
			sc[i] = Integer.parseInt(s.nextLine());

			// 총점
			tot += sc[i];
		}

		// 등수 구하기(다중for문)
		for (int i = 0; i < in; i++) {
			ra[i] = 1;
			for (int j = 0; j < in; j++) {
				// 비교되는 대상이 점수가 만약에 더 높으면 i번째의 등수를 1증가 시킨다
				if (sc[i] < sc[j]) {
					ra[i]++;
				}
			}
		}

		// 계산
		avg = (double) tot / in;

		// 출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("=========================");

		for (int i = 0; i < in; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + sc[i] + "\t" + ra[i]);

		}
		System.out.println("------------------------");
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);

	}

	public static void main(String[] args) {

		// test01();
		test02();
	}
}
