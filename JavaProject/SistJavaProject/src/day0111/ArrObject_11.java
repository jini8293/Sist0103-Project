package day0111;

class Shop {
	private String sangpum;
	private int price;
	private String Color;

	public Shop(String s, int p, String c) {
		this.sangpum = s;
		this.price = p;
		this.Color = s;
	}

	public static void showTitle() {
		System.out.println("상품명\t가격\t색상");
		System.out.println("======================");
	}

	public void showShop() {

		System.out.println(sangpum + "\t" + price + "원\t" + Color);

	}
}

public class ArrObject_11 {

	public static void main(String[] args) {

		Shop[] shop = { new Shop("목도리", 200000, "블루"), new Shop("장갑", 100000, "화이트"), new Shop("니트", 500000, "그린"),
				new Shop("집업", 600000, "블랙") };

		Shop.showTitle();

		for (int i = 0; i < shop.length; i++) {
			shop[i].showShop();
			System.out.println("----------------------");
		}

	}

}
