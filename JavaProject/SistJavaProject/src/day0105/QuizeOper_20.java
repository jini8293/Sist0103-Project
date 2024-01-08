package day0105;

import java.util.Scanner;

public class QuizeOper_20 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String name;
		int num, ch, d = 0;

		System.out.print("상품명: ");
		name = s.nextLine();
		System.out.print("수량: ");
		num = s.nextInt();
		System.out.print("가격: ");
		ch = s.nextInt();

		/*
		 * if (num>=5) {
		 *  dch = ((ch*num)*0.9); 
		 * }else { 
		 * 	dch = (ch*num); 
		 * }
		 * 
		 * if (num>=5) {
		 * 	d = ((ch*num)-((ch*num)*0.9)); 
		 * }else { 
		 * 	d = 0; 
		 * }
		 */
		if (num >= 5) {
			d = (ch * num) / 10;
		}

		System.out.println("\n=====================");
		System.out.println("5개 이상 구매시 10% 할인됩니다.");
		// System.out.printf("%s %d개는 총 %-10.0f원 입니다.\n" ,name,num,dch);
		System.out.println(name + " " + num + "개는 총 " + ((ch * num) - d) + "원 입니다.");
		// System.out.printf("할인된 금액: %-10.0f원",d);
		System.out.println("할인된 금액: " + d + "원");
	}

}
