package day0104;

public class DataType_09 {

	public static void main(String[] args) {
		// args이용한 연산
		
		//변수선언
		int java = Integer.parseInt(args[0]);
		int jsp = Integer.parseInt(args[1]);
		int spring = Integer.parseInt(args[2]);
		
		//계산
		int tot = java + jsp + spring;
		int count = 3; //과목 3개 의미하는 변수
		
		double avg1 = tot/count; //결과값은 int
		double avg2 = (double)tot/count; //결과값 double
		double avg3 = tot/(double)count; //결과값 double
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		
		int a = Integer.parseInt(args[3]);
		System.out.printf("총점은 %d",a );
		System.out.println("총점="+ tot);
		System.out.printf("평균=%.2f\n",avg1);
	}

}
