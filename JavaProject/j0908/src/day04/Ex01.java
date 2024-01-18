package day04;

class Item{
	public int price;
	
}

class Noodle extends Item{
	public Noodle() {
		super.price=4000;
	}
	public String toString() {
		return "국수";
	}
}

class MixNoodle extends Item{
	public MixNoodle() {
		super.price=4500;
	}
	public String toString() {
		return "비빔국수";
	}
}

class Woodong extends Item{
	public Woodong() {
		super.price=5000;
	}
	public String toString() {
		return "우동";
	}
}

class Buyer{
	private int money;
	
	//생성자로 초기화
	public Buyer(int money) {
		this.money=money;
	}
	
	public void buy(Item it, int count) {
		money=money-it.price*count;
		System.out.println("메뉴:"+it.toString()+" 가격:"+it.price+" 주문개수:"+count+" 남은돈:"+money);
		
	}
}

public class Ex01 {
	 public static void main(String[] args) {
		 Buyer buyer=new Buyer(20000);
		 buyer.buy(new Noodle(), 2);
		 buyer.buy(new Woodong(),1);
	
	 }
}
