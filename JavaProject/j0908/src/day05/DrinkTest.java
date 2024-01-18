package day05;


abstract class Drink{
	protected String name;
	public Drink(String name) {
		this.name=name;
	}
	abstract public void ordering();
}

class Beer extends Drink{
	private int price;
	
	public Beer(String name, int price) {
		super(name);
		this.price=price;
	}

	@Override
	public void ordering() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 가격 : "+price);
	}
}

class Coffee extends Drink{
	private int price;
	public Coffee(String name, int price) {
		super(name);
		this.price=price;
	}
	@Override
	public void ordering() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 가격 : "+price);
	}
}


public class DrinkTest {

	public static void main(String[] args) {
		/*
		Drink d1 = new Beer("카스",5000);
		Drink d2 = new Coffee("카페라떼",3000);
		Drink d3 = new Coffee("아메리카노",2500);
		Drink d4 = new Coffee("버드와이저",7000);
		Drink[] d = {d1, d2, d3, d4};
		*/
		Drink[] d = new Drink[3];
		//d[1]=new Beer(); //생성자 초기화해서 이렇게 못 넣음(디폴트 생성자 x)
		d[1]=new Beer("테라", 5000);
		d[2]=new Coffee("카페라떼", 4000);
		d[3]=new Beer("카스",5000);
		System.out.println("===주문내역===========");
		for(Drink list:d) {
			list.ordering();
		}

	}

}
