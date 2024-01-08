package day0108;

public class SumTest_11 {

	public static void main(String[] args) {
		// 반복문안에서 합계구하기
		
		int sum=0;
		for(int i=1;i<=5;i++) {
			//sum=sum+i; => sum에 들어간 숫자는 계속 누적됨.
			sum+=i;
		}
		
		System.out.println("1~5까지의 합: " +sum+"입니다.");
		
		
		//While
		int n=1;
		int tot=0;
		
		while(n<=10) {
			tot+=n;
			n++;
		}

		System.out.println("1~10까지의 합: " +tot+"입니다.");
		
		System.out.println("for문으로 1~10까지중 2씩 증가할 경우의 합계를 구하시오");
		int a;
		int er=0;
		for(a=1;a<=10;a+=2) {
			er+=a;
		}
		System.out.println("1~10까지중 2씩 증가된 수의 합: " +er+"입니다.");
		
		
		
	}

}
