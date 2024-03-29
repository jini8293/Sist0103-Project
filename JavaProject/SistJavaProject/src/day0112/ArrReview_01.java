package day0112;

import java.io.PrintStream;
import java.util.Scanner;

class Food {

	private String fName;
	private int fPrice;

	static int no;

	// 명시적 생성자(2개)
	public Food(String name, int price) {
		this.fName = name;
		this.fPrice = price;

	}

	// 출력문

	public void getTitle() {
		no++;
		System.out.println("[메뉴_" + no + "]");
		System.out.println("----------------------");
		System.out.println("음식명: " + fName);
		System.out.println("가격: " + fPrice);

	}

}

public class ArrReview_01 {

	public static void main(String[] args) {

		// 방법 1
		/*
		 * Food food1 = new Food("까르보나라",15000); 
		 * food1.getTitle(); 
		 * Food food2 = new Food("토마토 파스타",14000); 
		 * food2.getTitle(); 
		 * Food food3 = new Food("투움바 파스타",16000); 
		 * food3.getTitle();
		 */

		// 방법 2
		/*Food[] food = { new Food("까르보나라", 15000), new Food("토마토 파스타", 14000), new Food("투움바 파스타", 16000) };

		for (int i = 0; i < food.length; i++) {
			food[i].getTitle();
			System.out.println("==================");
		}*/
		
		//방법 3
		Food [] food = new Food[3];
		food[0] = new Food("까르보나라",15000);
		food[1] = new Food("토마토 파스타",14000);
		food[2] = new Food("투움바 파스타",16000);
		
		for(int i=0;i<food.length;i++) {
			
			/*Food f = food[i];
			f.getTitle();*/
			
			food[i].getTitle();
			System.out.println("===========================");
		}
		
		for(Food f : food) {
			f.getTitle();
			System.out.println("===========================");
		}
		

	}

}
