package day0112;

class School {
	public static final String SCHOOLNAME = "쌍용고등학교";
	private String schoolAddr;
	private int countSu;
	private int countTeacher;

	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountSu() {
		return countSu;
	}

	public void setCountSu(int countSu) {
		this.countSu = countSu;
	}

	public int getSountTeacher() {
		return countTeacher;
	}

	public void setSountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}

	public School() {
		this("강남구 역삼동", 120, 10);
	}

	public School(String saddr, int cntstu, int cnttea) {
		this.schoolAddr = saddr;
		this.countSu = cntstu;
		this.countSu = cnttea;
	}

	

	// 메서드
	public void writeData() {
		System.out.println("학교주소: " + this.schoolAddr);
		System.out.println("학생수: " + this.countSu + ", 선생님수: " + this.countTeacher);

	}

}// School

class Student extends School {

	private String stuName;
	private int grade;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {

	}

	public Student(String saddr, int cntstu, int cnttea, String stuname, int gra) {
		super(saddr,cntstu,cnttea);
		this.stuName = stuname;
		this.grade = gra;
	}
	
	//재정의
	@Override
	public void writeData() {
		super.writeData();
		System.out.println("학교명: "+SCHOOLNAME);
		System.out.println("학생 이름:"+stuName);
		System.out.println("학생 학년: "+grade);
	}
}

public class Inherit_07 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.writeData();
		System.out.println();
		
		Student s2 = new Student("영등포구",300,35,"김숙",2);
		s2.writeData();
		
		System.out.println();
		System.out.println("1번째 학생 학생명과 학년 변경후 출력");
		s1.setStuName("이영자");
		s1.setGrade(1);
		s1.writeData();

	}

}
