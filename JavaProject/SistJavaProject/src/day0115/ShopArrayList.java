package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ShopArrayList {

	List<Shop> list = new Vector<Shop>();

	public void ipgo() {
		Scanner s = new Scanner(System.in);
		String sangname;
		int su, dan;

		System.out.print("상품명: ");
		sangname = s.nextLine();

		System.out.print("가격: ");
		dan = s.nextInt();

		System.out.print("수량: ");
		su = s.nextInt();

		Shop data = new Shop(sangname, dan, su);
		list.add(data);

		System.out.println(list.size() + "개의 상품을 입고했어요!!");
	}

	// 출력
	public void jego() {
		System.out.println("**상품 재고 현황**");
		System.out.println();
		System.out.println("No.\t상품명\t가격\t수량\t총액");
		System.out.println("================================================");
		for (int i = 0; i < list.size(); i++) {
			Shop s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\n", (i + 1), s.getSangname(), s.getDan(), s.getSu(), s.getTot());
			System.out.println("------------------------------------------------");
		}

	}

	public static void main(String[] args) {

		ShopArrayList sh = new ShopArrayList();
		Scanner s = new Scanner(System.in);

		int n;

		while (true) {
			System.out.println("\n1.상품 입고\t2.상품 재고\t9.시스템 종료");
			n = Integer.parseInt(s.nextLine());
			if (n == 1) {
				sh.ipgo();
			} else if (n == 2) {
				sh.jego();
			} else if (n == 9) {
				System.out.println("***종료합니다***");
				break;
			}

		}

	}
}
