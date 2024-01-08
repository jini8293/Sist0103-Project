package day0108;

public class For_09 {

	public static void main(String[] args) {
		
		System.out.println("\n\n** for문 가로로 1~10출력 **");
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+"  ");
		}
		
		System.out.println("\n\n** for문 가로로 10~1출력 **");
		int a;
		for(a=10;a>=1;a--) {
			System.out.print(a+"  ");
		}
		
	
		System.out.println("\n\n** for문 배수, continue **");
		
		System.out.println("\n\n** for문 배수 2의 배수 **");
		int s;
		for(s=1;s<=16;s*=2) {
			System.out.print(s+"  ");
		}
		
		System.out.println("\n\n** for문 5씩 증가 **");
		int e;
		for(e=0;e<=50;e+=5) {
			System.out.print(e+"  ");
		}
		
		System.out.println("\n\n** for문 continue 5의 배수 제외 출력 **");
		int k;
		for(k=1;k<=20;k++) {
			if(i%5==0) {
				continue;// continue 수행하지 않고 i++로 이동
			}
			
			System.out.print(k+" ");
		}
		
		
		
		
		
		
		
	}

}
