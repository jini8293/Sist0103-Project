package day0108;

import java.util.Scanner;

public class QuizFor_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	
		System.out.println("1. 1 2 4 5 7 8 10 (continue활용)");
		int k;
		for(k=1;k<=10;k++) {
			if(k%3==0) {
				continue;
			}
			System.out.print(k+"  ");
		}
		
		System.out.println("\n2. 홀수값:1 홀수값:3 홀수값:5 홀수값:7 홀수값:9");
		int a;
		for (a=1;a<=10; a++) {
			if(a%2==0) {
				continue;
			}
			System.out.print("홀수값: "+a+"  ");
		}
		
		int x;
		System.out.println("\n3. 점수를 입력후 합계를 구하는데 0을 입력하면 빠져나와서 합계출력_while(true)");
		int rr=0;
		while (true) {
			System.out.print("점수입력: ");
			x = s.nextInt();
			if (x==0) 
			{
				break;
			} 
			if(x<0 || x>100)
			{
				System.out.println("다시입력해주세요(1~100)");
				continue;
			}
			
			rr+=x;
		}
		System.out.println("합계: " + rr);

	}

}
