package day0105;

import java.util.Scanner;

public class QuizeOper_13 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력하여 가장큰값 구해라
		//if+삼항
		
		Scanner s = new Scanner(System.in);
		
		int a,b,c, max;
		
		System.out.println("3개의 숫자를 입력하시오.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.println("**if**");
		if(a>b && a>c) {
			max = a;
		}else if (b>c && b>a) {
			max = b;
		}else {
			max = c;
		}
		System.out.println("max=" +max);
		
		
		System.out.println("**삼항연산자**");
		max = (a>b && a>c)? a :
				(b>c && b>a)? b  : c;
				
		
		
		System.out.println("max=" +max);
	

	}

}
