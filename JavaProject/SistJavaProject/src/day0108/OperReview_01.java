package day0108;

import java.util.Scanner;

public class OperReview_01 {

	public static void main(String[] args) {

		// import, 선언, 입력, 계산, 출력

		Scanner s = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		System.out.println("이름을 입력하세요.");
		name = s.nextLine();
		System.out.println("국영수 점수?");
		kor = s.nextInt();
		eng = s.nextInt();
		mat = s.nextInt();

		double avg = (kor + eng + mat) / 3.0;

		/*
		 * System.out.println("3과목의 점수: " + kor + "," + eng + "," + mat);
		 * System.out.printf("평균: %.2f\n" ,avg);
		 * 
		 * System.out.println("***합격 조건: 평균이 60점 이상이고 각 과목모두 40점 이상이면 합격***");
		 * System.out.println("=======================================================")
		 * ;
		 * 
		 * //if조건문 if(kor >= 40 && eng>= 40 && mat >= 40 && avg >= 60) {
		 * System.out.println(name+"님은 합격입니다."); }else {
		 * System.out.println(name+"님은 불합격입니다."); }
		 */

		// <!-- 삼항연산자 복습 -->
		System.out.printf("평균: %5.1f\n", avg);
		System.out.println("***평가: 80점이상: 매우잘함 70점 이상: 좀더 노력 70점 미만: 불합격***");
		System.out.println("평가: " + (avg >= 80 ? "매우잘함: " : avg >= 70 ? "좀더 노려할것!!" : "불합격"));
		
	}

}
