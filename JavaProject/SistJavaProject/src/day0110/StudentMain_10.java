package day0110;

public class StudentMain_10 {
	
	
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.stuName="이효리";
		stu1.stuAge=22;
		
		stu2.stuName="이상순";
		stu2.stuAge=30;
		
		Student.schoolName="쌍용고등학교";
		
		System.out.println("**클래스 멤버값 출력**");
		System.out.println("학교명: "+Student.schoolName);
		System.out.println("**학생1 정보**");
		System.out.println("이름: "+stu1.stuName+", 나이: "+stu1.stuAge);
		System.out.println("**학생2 정보**");
		System.out.println("이름: "+stu2.stuName+", 나이: "+stu2.stuAge);
		
	
		
		
		
		
		
		
		
		
		
	}

}
