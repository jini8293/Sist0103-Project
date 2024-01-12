package day0112;

import java.util.Scanner;

class Quiz {

	static String scName = "쌍용교육센터";
	private String name;
	private int java;
	private int oracle;
	private int html;
	double sc;

	public static String getScName() {
		return scName;
	}

	public static void setScName(String scName) {
		Quiz.scName = scName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	// 합계
	public int getTot() {
		int t = java + oracle + html;
		return t;
	}

	// 평균
	public double getAvg() {
		double d = getTot() / 3.0;
		return d;
	}
	
	public String getGr() {
		sc=getAvg();
		String gr; // 평가

		if (sc >= 90) {
			gr = "장학생";
		} else if (sc >= 80) {
			gr = "합격";
		} else {
			gr = "불합격";

		}
		return gr;
	}

	public static void getTitle() {
		System.out.println("학교명: " + scName);
		System.out.println();
		System.out.println("이름\tJAVA\tORACLE\tHTML\t총점\t평균\t평가");
		System.out.println("===============================================");
	}

}

public class SsQuiz_15 {

	public static void showData(Quiz[] qu) {
		Quiz.getTitle();
		for (Quiz q : qu) {

			System.out.printf("\n%s\t%d\t%d\t%d\t%d\t%.1f\t%s", q.getName(), q.getJava(), q.getOracle(), q.getHtml(),
					q.getTot(), q.getAvg(),q.getGr());
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int inwon;
		Quiz[] qu;

		System.out.print("입력할 학생 수: ");
		inwon = Integer.parseInt(s.nextLine());

		qu = new Quiz[inwon];
		for (int i = 0; i < inwon; i++) {
			qu[i] = new Quiz();
			System.out.print("학생 이름: ");
			String name = s.nextLine();
			System.out.print("자바 점수: ");
			int java = Integer.parseInt(s.nextLine());
			System.out.print("오라클 점수: ");
			int oracle = Integer.parseInt(s.nextLine());
			System.out.print("html 점수: ");
			int html = Integer.parseInt(s.nextLine());

			
			qu[i].setName(name);
			qu[i].setJava(java);
			qu[i].setOracle(oracle);
			qu[i].setHtml(html);
		}
		showData(qu);

	}

}
