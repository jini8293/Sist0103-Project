package day0104;

import java.util.Scanner;

public class QuizeKeyBoardIn_16 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		String phone;
		int price;
		int num;
		int tot;
		
		System.out.print("상품명을 입력하세요==>");
		phone=s.nextLine();
		
		System.out.print("가격은 얼마입니까?==>");
		price=s.nextInt();
		
		System.out.print("수량은 몇개입니까?==>");
		num=s.nextInt();
		
		tot = price*num;
		
		System.out.println("상품입고");
		System.out.println("====================");
		System.out.println("입고상품명: "+ phone);
		System.out.println("수량: " + num);
		System.out.println("가격: " + price);
		System.out.println("====================");
		System.out.println("총가격: " + tot);
		

	}

}
