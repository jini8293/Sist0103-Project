package day0108;

public class For_07 {

	public static void main(String[] args) {
		// while문과 for문 비교

		int i = 10;

		System.out.println("***while문으로 10~0출력***");
		while (i >= 0) {
			System.out.print(i-- + "  ");
		}

		System.out.println("\n\n***for문으로 10~0출력***");

		for (int a = 10; a >= 0; a--) {
			System.out.print(a + "  ");
		}

		System.out.println("\n\n***for문으로 1~10 종료***");

		for (int a = 1; a <= 10; a++) {
			System.out.print(a + "  ");
		}

		System.out.print("종료");

		System.out.println("\n\n** while문 1~10 종료 **");

		int a = 1;
		while (true) {
			System.out.print(a++ + "  ");
			if (a > 10) {
				break;
			}
		}
		System.out.print("종료");

		System.out.println("\n\n** for문 1,4,7,10 **");
		for (int b = 1; b <= 10; b += 3) {
			System.out.print(b + "  ");
		}
	
		
		System.out.println("\n\n** for문 5,4,3,2,1 **");
		for (int a1=5; a1>=1; a1--) {
			System.out.print(a1 + "  ");
		}

		
		System.out.println("\n\n** while문 5,4,3,2,1 **");

		int h = 5;
		while (h>0) {
			System.out.print(h-- + "  ");
		}
		
		System.out.println("\n\n** while문 5,4,3,2,1 **");
		int x = 5;
		while (true) {
			System.out.print(x-- + "  ");
			if (x==0) {
				break;
			}
		}
		
		System.out.println("\n\n** for문 helloJava를 5번 반복 **");
		
		int s=1;
		for (;s<=5; s++) { // ;은 무조건 줘야함 근데 그냥 조건문 쓰자~ int로 변수 설정은 하고~
			System.out.print("HelloJava"+"  ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
