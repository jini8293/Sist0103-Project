package day0105;

import java.util.Scanner;

public class QuizeOper_19 {

	public static void main(String[] args) {
		// 
		
		Scanner s = new Scanner(System.in);
		
		String name, tt;
		int k, e, m;
		double a;
		
		System.out.println("이름을 입력하세요");
		name = s.nextLine();
		System.out.println("국,영,수 점수를 입력하세요");
		k = s.nextInt();
		e = s.nextInt();
		m = s.nextInt();
		
		System.out.println("\n["+name+"님의 기말고사 성적]");
		System.out.println("총점: " + (k +e +m));
		
		a = (k +e +m)/3.0;
		System.out.printf("평균: %.1f\n" ,a);
		
		
		if (a>=90) {
			tt = "매우잘함";
		}else if (a>=80) {
			tt= "잘함";
		}else if (a>=70) {
			tt="노력하세요";
		}else {
			tt="꽝!";
		}
		
		System.out.println("평가: " + tt);

	}

}
