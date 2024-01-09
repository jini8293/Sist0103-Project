package day0109;

import java.util.Scanner;

public class QuizInOutRank_16 {
	public static void Q_01() {
		
		Scanner s = new Scanner(System.in);
		
		int i;
		int rr=1;
		System.out.print("숫자를 입력해주세요: ");
		i = s.nextInt();
		for(int r=1;r<=i;r++) {
			rr*=r;
			
		}
		System.out.println(i+"! = "+rr);
	}
	
	public static void Q_02() {
		
		Scanner s = new Scanner(System.in);
		int x,y;
		int g=1;
		
		System.out.println("두 수를 입력하세요: ");
		x=s.nextInt();
		y=s.nextInt();
		
		for(int i=1;i<=y;i++) {
			g*=x;
			
		}
		
		System.out.println(x+"의 "+y+"승 = "+ g);
		
	}
	
	public static void Q_03() {
		
		int ztot = 0;
		int htot = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				ztot+=i;
			}else {
				htot+=i;
			}
		}
		System.out.println("짝수의 합계: "+ztot);
		System.out.println("홀수의 합계: "+htot);
	}
	
	public static void main(String[] args) {
		
		//Q_01();
		Q_02();
		//Q_03();
		
		
		//1. 팩토리얼 구할 숫자를 입력하여 해당숫자에 대한 팩토리얼 구하기
		//5!=정답
		//4!=정답
		
		//2. 두수 x,y 를 입력후 x의 y승
		//for문 이용

		//3. 1~100까지의 짝수의 합과 홀수의 합을 나눠서 출력 
		//for문 이용 
		

		
		
		
		
		
		
		
	}
	
	

}
