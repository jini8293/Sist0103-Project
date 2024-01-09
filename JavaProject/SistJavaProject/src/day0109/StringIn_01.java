package day0109;

import java.util.Scanner;

public class StringIn_01 {
	
	public static void string_01 () {
		
		// 1. 이름을 입력해서 김씨가 몇명인지 
		Scanner s = new Scanner(System.in);
		
		String name;
		int cnt=0;
		
		while (true) {
			System.out.print("이름입력(종료: 끝)");
			name = s.nextLine();
			
			//break
			if(name.equals("끝")) {
				break;
			}
			//조건
			if(name.startsWith("김")) { //startsWith: 첫글자가 //endsWith: 마지막글자가
				cnt++;
			}
		}
		System.out.println("김씨성을 가진 사람은 총" + cnt + "명 입니다.");
		
	}
	

	public static void main(String[] args) {
		
		string_01();
	
	}

}
