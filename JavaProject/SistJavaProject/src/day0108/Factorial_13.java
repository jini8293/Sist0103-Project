package day0108;

import java.util.Scanner;

public class Factorial_13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1~10까지의 Factoeial구하기

		int i;
		int rr=1;
		for(i=1;i<=10;i++) {
			rr*=i;
			System.out.println(i+"! = "+rr);
		}
		
		//Q. 합계를 구할 숫자를 입력시 1부터 여러분이 입력한 숫자 까지합을 구해주세요	
		int x;
		int ee=1;
		System.out.print("숫자입력: ");
		x = s.nextInt();
		
		for(int t=1;t<=x;t++) {
			ee+=t;
		}
		System.out.println("1부터 "+x+"까지의 합계는 "+ee);
		
	}

}
