package day0109;

public class Array_08 {

	public static void main(String[] args) {
		// 배열 선언...기본형 배열은 객체로 인식

		int[] arr, arr2;
		arr = new int[3]; //메모리 할당
		arr2 = new int[5]; // 할당만 해도 값은 자동으로 초기화 _0 으로 초기화
		
		//배열에 값을 넣는다
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		System.out.println("배열의 길이: "+ arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("====================");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("====================");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println((i+1)+"번째: " +arr2[i]);
		}
		System.out.println("====================");
		
		System.out.println("for~each문"); //for자료형 변수 배열명
		for(int a1:arr) {
			System.out.println(a1);
		}
		System.out.println("====================");
		
		
		
		
		
		
		
		
	}

}
