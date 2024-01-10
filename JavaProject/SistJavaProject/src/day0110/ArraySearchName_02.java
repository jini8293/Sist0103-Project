package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {

	public static void main(String[] args) {
		
		String [] name = {"홍길동","강길동","최길동","김재석","유재석","홍재석","강호동","이호동","유효동"};
		
		Scanner s = new Scanner(System.in);
		String names;
		boolean flag;
		
		while(true) {
			System.out.println("검색할 이름 입력");
			names=s.nextLine();
			
			//0입력시 종료
			if(names.equals("f")) {
				System.out.println("프로그램 종료");
				break;
			}
			flag=false;
			for(int i=0;i<name.length;i++) {
				if(names.equals(name[i])) {
					flag=true;
					System.out.println(i+1+"번째 에서 검색됨");
				}
			}
			
			if(!flag) { //flag==false
				System.out.println(names+"는 데이터에 없습니다.");
			}
				
		}

	}
}


