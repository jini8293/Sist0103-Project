package com.sub;
import java.util.Scanner;
import com.main.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] sarr = new Student[3];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<sarr.length; i++) {
			System.out.println("이름과 국어, 영어, 수학 점수 입력");
			String name=s.next();
			int kor=s.nextInt();
			int eng=s.nextInt();
			int math=s.nextInt();
			sarr[i]=new Student(name, kor, math, eng);
			
			double avg=(kor+eng+math)/sarr.length;
			sarr[i].setAvg(avg);
			//sarr[i].setAvg((kor+eng+math)/(double)sarr.length);
			if(avg>=90)
				sarr[i].setGrade('A');
			else if(avg>=80)
				sarr[i].setGrade('B');
			else if(avg>=70)
				sarr[i].setGrade('C');
			else if(avg>=60)
				sarr[i].setGrade('D');
			else if(avg<60)
				sarr[i].setGrade('F');
			
		}
		System.out.println("==결과값 출력==");
		for(Student slist:sarr)
			System.out.println(slist);
	}

}
