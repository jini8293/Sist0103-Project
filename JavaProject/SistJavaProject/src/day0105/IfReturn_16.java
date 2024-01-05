package day0105;

import java.util.Scanner;

public class IfReturn_16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int sc;
		
		System.out.println("점수를 입력하시오(1~100)");
		sc = s.nextInt();
		
		if(sc<1 || sc>100) {
			System.out.println("잘못입력.");
			return; //현재 main 함수종료
		}else {
			System.out.println("점수: " + sc);
		}
		
		
		

	}

}
