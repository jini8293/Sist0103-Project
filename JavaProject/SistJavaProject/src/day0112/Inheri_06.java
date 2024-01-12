package day0112;

class Emart {

	private String sangpom;
	private int su;

	public Emart() {
		// sangpom="딸기";
		// su=10;

		this("딸기", 10);
	}

	public Emart(String sangpom, int su) {
		this.sangpom = sangpom;
		this.su = su;
	}

	public void writeMart() {
		System.out.println("상품명: " + sangpom);
		System.out.println("수량: " + su);

	}

}// Emart

class KangnamEmart extends Emart {

	private int price;

	public KangnamEmart() {
		price = 10000;
	}

	KangnamEmart(String sangpom, int su, int price) {
		super(sangpom, su);
		this.price = price;

	}

	// 재정의
	@Override
	public void writeMart() {
		System.out.println("단가: " + price);
		super.writeMart();
	}

}// KangnamEmart

public class Inheri_06 {

	public static void main(String[] args) {
		
		KangnamEmart kang1 = new KangnamEmart();
		kang1.writeMart();
		
		System.out.println();
		
		KangnamEmart kang2 = new KangnamEmart("수박", 5, 25000);
		kang2.writeMart();

	}

}
