package day0110;

class Ipgo{
	private String sangName;
	private int Price;
	
	
	public String getSangName() {
		return sangName;
	}
	public void setSangName(String sangName) {
		this.sangName = sangName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}


public class SangpumIpgo_13 {

	public static void main(String[] args) {
		
		Ipgo ip = new Ipgo();
		Ipgo ip2 = new Ipgo();
		
		ip.setSangName("사과");
		ip2.setSangName("오렌지");
		
		ip.setPrice(2500);
		ip2.setPrice(4400);
		
		String name = ip.getSangName();
		int pr = ip.getPrice();
		
		String name2 = ip2.getSangName();
		int pr2 = ip2.getPrice();
		
		System.out.println(name+", "+pr);
		System.out.println(name2+", "+pr2);
		
	}

}
