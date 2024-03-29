package day0111;

import java.util.Scanner;

class Sangyong {

	static String cName = "쌍용";
	private int ss;// 사원수
	private String sName;// 사원명
	private int mPay;// 월급여
	private int msPay;// 월수당

	public static String getcName() {
		return cName;
	}

	public static void setcName(String cName) {
		Sangyong.cName = cName;
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getmPay() {
		return mPay;
	}

	public void setmPay(int mPay) {
		this.mPay = mPay;
	}

	public int getMsPay() {
		return msPay;
	}

	public void setMsPay(int msPay) {
		this.msPay = msPay;
	}

	public int getTotalPay() {
		int n = mPay + msPay;
		return n;
	}

	public static void getTitle() {
		System.out.println("[" + cName + "_1월 급여내역]");
		System.out.println("사원명\t기본급\t수당\t 실수령액");
		System.out.println("==================================");
	}

}

public class QuizInstance_16 {

	public static void writeSy(Sangyong[] sy) {

		Sangyong.getTitle();
		for (Sangyong s : sy) {
			System.out.println(s.getsName() + "\t" + s.getmPay() + "\t" + s.getMsPay() + "\t   "
					+ s.getTotalPay());
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int inwon;
		Sangyong[] sy;

		System.out.print("입력할 직원 수: ");
		inwon = Integer.parseInt(s.nextLine());

		// 배열할당
		sy = new Sangyong[inwon];

		for (int i = 0; i < inwon; i++) {
			sy[i]=new Sangyong();
			System.out.print("총 사원 수: ");
			int ss = Integer.parseInt(s.nextLine());
			System.out.print("사원명: ");
			String sName = s.nextLine();
			System.out.print("월 급여: ");
			int mpay = Integer.parseInt(s.nextLine());
			System.out.print("월 수당: ");
			int mspay = Integer.parseInt(s.nextLine());

			sy[i].setSs(ss);
			sy[i].setsName(sName);
			sy[i].setmPay(mpay);
			sy[i].setMsPay(mspay);
		}
		writeSy(sy);

	}
}
