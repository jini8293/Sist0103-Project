package day0104;

import java.util.Scanner;

public class KeyBoardIn_14 {

	public static void main(String[] args) {
		// 키보드 입력에 필요한 Scanner class를 import
		// 1. import
		Scanner s = new Scanner(System.in);
		
		// 2. 변수 선언
		String name;
		int age;
		
		// 3. 입력
		System.out.print("이름을 입력해 보세요 ===>");
		name = s.nextLine();// 한줄을 문자로 읽어온다김(공백사용가능)
		
		System.out.print("나이를 입력하세요 ===>");
		//age = s.nextInt(); //숫자로 읽어온다.
		//숫자 입력후 엔터 누르면 그 엔터가 키보드 버퍼로 저장되어 다음문자열 읽을때 먼저 읽어버리는 현상 발생
		//그래서 다음문자열 읽기전에 그 엔터 읽어 없애기...s.nextLine()
		age=Integer.parseInt(s.nextLine());

		System.out.println("당신이 사는 지역은?");
		String city=s.nextLine();
		
		System.out.println(name + "님의 나이는 " + age + "세 이고 " + city + "지역에 살아요.");

	}

}
