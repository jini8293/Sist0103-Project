package day0105;

import java.util.Scanner;

public class OperTest_08 {

	public static void main(String[] args) {
		// 표준몸무게 출력 (키-100)*0.9 ... 표준 몸무게는 소수점 한자리로 출력
		Scanner s = new Scanner(System.in);
		
		String name;
		int k, w;
		Double st;
		
		
		System.out.print("당신의 이름? => ");
		name = s.nextLine();
		
		System.out.print("키? => ");
		k = s.nextInt();
		
		System.out.print("몸무게? => ");
		w = s.nextInt();
		
		st = (k-100)*0.9;
		
		System.out.println("\n======================================");
		System.out.printf("%s님의 권장 표준 몸무게는 %.1fkg 입니다.", name, st);

	}

}
