package day0110;

class Mart {
	private String sangpum;
	int su;
	int dan;
	static String SHOPNAME="롯데마트";
	
	public Mart(int su, int dan) {
		this.su=su;
		this.dan=dan;
	}
	public Mart() {
		// TODO Auto-generated constructor stub
	}

	
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public static String getSHOPNAME() {
		return SHOPNAME;
	}


	
	
}

public class QuizClass_16 {

	public static void main(String[] args) {
		
		Mart mart = new Mart();
		Mart mart2 = new Mart();
	
		 
		mart.setSangpum("초코파이");
		mart.su=10;
		mart.dan=4500;
		
		String mname = mart.getSangpum();
		int msu = mart.su;
		int md = mart.dan;
		
		mart2.setSangpum("엄마손파이");
		mart2.su=5;
		mart2.dan=2500;
		
		
		String mname2 = mart2.getSangpum();
		int msu2 = mart2.su;
		int md2 = mart2.dan;
		
		String name = Mart.getSHOPNAME();
		
		//System.out.println("**"+Mart.SHOPNAME+ " 입고물품**");
		System.out.println("**"+name+ " 입고물품**");
		System.out.println("===================");
		//System.out.println("상품명: "+mart.getSangpum);
		System.out.println("상품명: "+mname);
		System.out.println("수량: "+msu+"개");
		System.out.println("가격: "+md+"원");
		System.out.println("--------------------");
		System.out.println("상품명: "+mname2);
		System.out.println("수량: "+msu2+"개");
		System.out.println("가격: "+md2+"원");
		

	}

}
