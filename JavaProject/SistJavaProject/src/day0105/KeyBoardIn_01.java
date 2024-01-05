package day0105;

import java.util.Scanner;

public class KeyBoardIn_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String name, hp, addr;
		
		System.out.print("이름을 입력하세요: ");
		name = s.nextLine();
		
		System.out.print("핸드폰 번호를 입력하세요: ");
		hp = s.nextLine();
		
		System.out.print("주소를 입력하세요: ");
		addr = s.nextLine();
		
		System.out.println("==========================");
		System.out.println("\t[입력결과]");
		System.out.println("이름: " + name + "님");
		System.out.println("핸드폰 번호: " + hp);
		System.out.println("주소: " + addr);
		
	}

}
