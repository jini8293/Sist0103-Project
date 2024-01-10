package day0110;

public class ArraysChange_03 {

	public static void t_01() {

		int a = 10, b = 20;
		System.out.println("a=" + a + ", b=" + b);
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a=" + a + ", b=" + b);
	}

	public static void t_02() {
		int a = 10, b = 20, c = 30;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		int temp;

		temp = a;
		a = b;
		b = c;
		c = temp;

		System.out.println("a=" + a + ", b=" + b);
	}
	
	public static void t_03() {
		
		int [] n = {5,8,4};

		for(int s:n) {
			System.out.println(s+" ");
		}

	}
	
	public static void t_04() {
		
		int [] n = {5,8,4};
		
		System.out.println("0번과 2번을 교환후 출력");
		int temp=n[0];
		n[0]=n[2];
		n[2]=temp;
		
		for(int s:n) {
			System.out.println(s+" ");
		}
	}
	
	
	

	public static void main(String[] args) {
		// 순서바꾸기 연습

		//t_01();
		//t_02();
		//t_03();
		t_04();
	}

}
