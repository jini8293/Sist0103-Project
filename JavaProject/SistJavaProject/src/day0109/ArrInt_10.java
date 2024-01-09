package day0109;

public class ArrInt_10 {

	public static void main(String[] args) {
		
		//배열 선언과 동시에 초기값 지정 할수있다
		
		int [] arr= {2,3,8,4,7,8,7,8,8};
		
		System.out.println("갯수:" + arr.length);
		
		System.out.println("출력1_for");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	
		System.out.println("\n출력1_foreach");
		for(int a:arr) {
			System.out.printf("%5d",a);
		}
		
		
		
	}

}
