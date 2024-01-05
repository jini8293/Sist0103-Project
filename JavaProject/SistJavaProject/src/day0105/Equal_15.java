package day0105;

import java.util.Scanner;

public class Equal_15 {

	public static void main(String[] args) {
		// 문자열 비교는 관계연산자로 이용안되고
		// equal()라는 메서드를 이용해서 비교한다.

		Scanner s = new Scanner(System.in);

		String word;

		System.out.println("영어단어를 입력해보세요.");
		System.out.println("ex) happy, rose, dragon, angel, music");
		word = s.nextLine();
		
		System.out.println("입력한 단어:" + word);
		
		//equalsIgnoreCase = 대문자 섞어도가능  equals = 대문자 안됨, 무조건 같은 철자만
		if(word.equalsIgnoreCase("happy")) {
			System.out.println("**행복**");
		} else if (word.equalsIgnoreCase("rose")) {
			System.out.println("**장미**");
		} else if (word.equalsIgnoreCase("dragon")) {
			System.out.println("**드래곤**");
		} else if (word.equalsIgnoreCase("angel")) {
			System.out.println("**천사**");
		} else if (word.equalsIgnoreCase("music")) {
			System.out.println("**음악**");
		} else {
			System.out.println("사전에 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
