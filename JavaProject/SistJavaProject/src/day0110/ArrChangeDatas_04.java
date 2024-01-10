package day0110;

public class ArrChangeDatas_04 {

	public static void t_01() {

		int[] arr = { 4, 8, 9, 12, 78, 98, 23, 22, 5, 3 };

		System.out.println("**원데이터**");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void t_02() {
		System.out.println("**거꾸로 변경하기**");
		
		int[] arr = { 4, 8, 9, 12, 78, 98, 23, 22, 5, 3 };
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void t_03() {
		System.out.println("**오름차순 정렬**");
		//가장작은숫자 앞으로 보내기(선택정렬)
		//Arrays.sorts(arr); 배열 arr을 정렬한다
		int[] arr = { 4, 8, 9, 12, 78, 98, 23, 22, 5, 3 };
		
		//기준 데이터는 0부터 끝에서 두번째 까지
		for(int i=0;i<arr.length-1;i++) {
			//비교하는 데이터는 기준 다음값부터 끝까지
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		//t_01();
		//t_02();
		t_03();
	}

}
