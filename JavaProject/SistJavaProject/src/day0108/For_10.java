package day0108;

public class For_10 {

	public static void main(String[] args) {
		
		System.out.println("** for문 가로로 10~1출력 **\n");
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+"  ");
		}

		System.out.print("\n** for문 빠져나온 i의 값: "+i+"\n\n");
	
		int a;
		for(a=0;a<=50;a+=5) {
			System.out.print(a+"  ");
		}

		System.out.println("\n** for문 빠져나온 a의 값: "+a);
		
		System.out.println("\n1~10까지 숫자중에서 짝수만 출력");
		int n;
		for(n=1;n<=10;n++) {
			if(n%2==0) {
				System.out.print(n+"  ");
			}
		}
		
		System.out.println("\n\n1~10까지 숫자중에서 짝수만 출력_continue");
		int k;
		for(k=1;k<=10;k++) {
			if(k%2==1) {
				continue;
			}
			System.out.print(k+"  ");
		}
		
		
	}

}
