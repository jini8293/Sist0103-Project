package day11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		//영어 단어의 번역된 한글을 출력 배열 리스트 저장하고 검색
		dic.put("baby", "아기");
		dic.put("apple", "사과");
		dic.put("love", "사랑");
		Scanner s = new Scanner(System.in);
		//exit 입력받으면 종료
		while(true) {
			
			System.out.print("찾고싶은 영어단어 입력 : ");
			String eng = s.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 사전에 없는 단어입니다.");
			else System.out.println(eng+"는 한글로 "+kor+"입니다.");
			
		}
	}

}
