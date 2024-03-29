package day0112;

import java.util.Scanner;

class Shop {

	private String sName;
	private int sPrice;
	private String sColor;
	private static int num;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsPrice() {
		return sPrice;
	}

	public void setsPrice(int sPrice) {
		this.sPrice = sPrice;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}


	

	public static void getTitle() {
		System.out.println("[쌍용매장 입고상품]");
		System.out.println();
		System.out.println("번호\t상품명\t가격\t색상");
		System.out.println("=============================");
	}
}

public class ArrReview_02 {

	public static void showData(Shop[] shop, int num) {
		Shop.getTitle();
		num=0;
		for (Shop s : shop) {
			num++;
			System.out.println(num+ "\t" + s.getsName() + "\t" + s.getsPrice() + "\t" + s.getsColor());

		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int no;
		Shop [] shop;
		
		System.out.println("상품 수 입력: ");
		no = Integer.parseInt(s.nextLine());
		
		shop = new Shop[no];
		
		for(int i=0; i<no;i++) {
			shop[i]=new Shop();
			System.out.print("상품 이름: ");
			String sname = s.nextLine();
			System.out.print("상품 가격: ");
			int sprice = Integer.parseInt(s.nextLine());
			System.out.print("상품 색상: ");
			String scolor = s.nextLine();
			
			shop[i].setsName(sname);
			shop[i].setsPrice(sprice);
			shop[i].setsColor(scolor);
		}
		showData(shop, no);

	}

}
