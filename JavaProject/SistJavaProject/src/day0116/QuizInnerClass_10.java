package day0116;

import java.util.Scanner;




class SawonOuter {

	private String sawonName;
	private int gibonPay, familySu, timeSu;
	


	public void process() {
		//데이터 입력
		InputInner i = new InputInner();
		i.inputData();
		
		//결과 출력
		SudangInner s = new SudangInner();
		s.showData();
	}

	class InputInner {

		public void inputData() {
			Scanner s = new Scanner(System.in);
			System.out.print("사원명 입력: ");
			sawonName = s.nextLine();
			System.out.print("기본급 입력: ");
			gibonPay = s.nextInt();
			System.out.print("초과시간 입력: ");
			timeSu = s.nextInt();
			System.out.print("가족수 입력: ");
			familySu = s.nextInt();
		}
	}

	class SudangInner {
		public int getTimeSudang() {
			return timeSu * 30000;

		}

		public int getFamilySudang() {
			if (familySu <= 4) {
				return 200000;
			} else {
				return 300000;
			}

		}

		public int getTex() {
			return (int) (gibonPay * 0.03);
		}

		public int getTot() {
			return gibonPay + getFamilySudang() + getTimeSudang() - getTex();
		}

		public void showData() {
			System.out.println("사원명\t기본급\t초과근무시간\t가족수\t시간수당\t가족수당\t세금\t총급여");
			System.out.println("===========================================================");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+familySu+"\t"+getTimeSudang()+"\t"+getFamilySudang()+"\t"+getTex()+"\t"+getTot());
		}

	}

}

public class QuizInnerClass_10 {

	public static void main(String[] args) {
		//방법 1 : 내부 클래스를 외부클래를 통해서 생성후 메서드 호출
		SawonOuter sawon = new SawonOuter();

		SawonOuter.InputInner sa = sawon.new InputInner();
		sa.inputData();
		
		SawonOuter.SudangInner su = sawon.new SudangInner();
		su.showData();
		
		//방법2 : 
		SawonOuter sawon1 = new SawonOuter();
		sawon1.process();
	}


}
