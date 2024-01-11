package day0111;

class Score {

	private String stuName;
	private int java;
	private int oracle;

	public static final String TITLE = "2023년도 기말고사";

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
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

	public static String getTitle() {
		return TITLE;
	}
	
	//추가할 메서드
	//합계
	public int getTot() {
		int t = java + oracle;
		return t;
	}
	
	//평균
	public double getAvg() {
		double d = getTot()/2.0;
		return d;
	}

	
	

}// Score

public class ObTest_08 {

	public static void main(String[] args) {
		Score s1 = new Score();
		s1.setStuName("박지선");
		s1.setJava(90);
		s1.setOracle(88);
		
		int tot = s1.getTot();
		double avg = s1.getAvg();
		
		System.out.println("**Score 클래스**");
		System.out.println(Score.TITLE);
		System.out.println("이름: "+s1.getStuName());
		System.out.println("자바 점수: "+s1.getJava());
		System.out.println("오라클 점수: "+s1.getOracle());
		System.out.println("합계: "+s1.getTot());
		System.out.println("평균: "+s1.getAvg());

	}

}
