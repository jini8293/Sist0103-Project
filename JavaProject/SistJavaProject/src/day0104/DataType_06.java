package day0104;

public class DataType_06 {

	public static void main(String[] args) {
		// 1. 기본 자료형 8개
		
		boolean flag = false; //논리형 true, false
		
		// 2. 문자형
		//반드시 하나의 문자, 16bit 유니코드값 표현
		//2byte 문자하나
		//기본적으로 정수형, 아스키코드로 변경이 가능하므로..
		//''로 표현
		char ch='가';
		
		// 3. 정수형
		byte a = 127; // 1byte -128 ~ 127
		short b = 32000; // 16bit
		int  c = 670000000; // 32bit
		long d = 5900000000000L; // 64bit 뒤에 L,l(대,소문자)을 붙혀야  long인지 int인지를 의미
		
		// 4. 실수
		float f=3.1234f; // 32bit 뒤에 f를 안붙히면 double을 의미
	
		double e = 23456.1234567; // 64bit 소수점가진 숫자를 의미 double이 기본
		
		
		//출력
		System.out.println("flag="+flag);
		System.out.println("문자형 ch="+ch);
		
		System.out.println("정수 a="+a);
		System.out.println("정수 b="+b);
		System.out.println("정수 c="+c);
		System.out.println("정수 d="+d);
		
		System.out.println("실수형 f="+f);
		System.out.println("실수형 e="+e);
		

	}

}
