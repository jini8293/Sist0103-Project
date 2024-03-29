package day0111;

import java.util.Scanner;

class Emp {

	private String sName;// 사원명
	private int gPay;// 기본급
	private int fSu;// 가족수
	private int tSu;// 초과근무시간

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getgPay() {
		return gPay;
	}

	public void setgPay(int gPay) {
		this.gPay = gPay;
	}

	public int getfSu() {
		return fSu;
	}

	public void setfSu(int fSu) {
		this.fSu = fSu;
	}

	public int gettSu() {
		return tSu;
	}

	public void settSu(int tSu) {
		this.tSu = tSu;
	}

	// 가족 수당 = 가족수*50000(단 2인 이상은 무조건 10만원)
	public int getFamilySudang() {
		int n = 0;// 메서드에서는 자동초기화 안됨
		if (fSu >= 2) {
			n = 100000;
		} else {
			n = fSu * 50000;
		}
		return n;
	}

	// 시간 수당 = 초과시간*3000(단 10시간이상은 30만원으로 통일)
	public int getTimeSudang() {
		int n = 0;
		if (tSu >= 10) {
			n = 300000;
		} else {
			n = tSu * 3000;
		}
		return n;
	}

	// 실 수령액 = 기본급+가족수당+시간수당
	public int getTotalPay() {
		int n = gPay + getFamilySudang() + getTimeSudang();
		return n;
	}

	// 제목
	public static void showTitle() {
		System.out.println("\n***쌍용 01월 직원 급여 현황**");
		System.out.println();
		System.out.println("사원명\t기본급\t자녀수\t초과근무시간    가족수당     시간수당      총급여");
		System.out.println("==================================================================");
	}

}// Emp

public class SawonInstanceScanner_15 {

	public static void writeEmp(Emp[] emp) {
		// 제목부터 출력
		Emp.showTitle();
		for (Emp e : emp) {
			System.out.println(e.getsName() + "\t" + e.getgPay() + "\t" + e.getfSu() + "\t" + e.gettSu() + "\t     "
					+ e.getFamilySudang() + "\t" + e.getTimeSudang() + "\t   " + e.getTotalPay());
		}
	}

	public static void main(String[] args) {
		// 메인에서는 인원수 입력후 해당사원에 대한 이름, 기본급, 가족수, 시간수 입력
		Scanner s = new Scanner(System.in);
		
		int inwon;
		Emp[] emp;
		
		System.out.print("입력할 직원수는?");
		inwon = Integer.parseInt(s.nextLine());
		
		//배열할당
		emp = new Emp[inwon];
		
		//인원수만큼 데이터 입력
		for (int i=0;i<inwon;i++) {
			emp[i]=new Emp();
			System.out.print("이름: ");
			String name=s.nextLine();
			System.out.print("기본급: ");
			int pay=Integer.parseInt(s.nextLine());
			System.out.print("자녀수: ");
			int fsu=Integer.parseInt(s.nextLine());
			System.out.print("초과근무시간: ");
			int tsu=Integer.parseInt(s.nextLine());
			
			
			//emp[i] = new Emp(name,pay,fsu,tsu);
			
			//setter로 emp클래스에 데이터 넣기
			emp[i].setsName(name);
			emp[i].setgPay(pay);
			emp[i].setfSu(fsu);
			emp[i].settSu(tsu);
			
		}
		writeEmp(emp);
		
		
		
	}

}
