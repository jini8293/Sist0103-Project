package day0111;

class Mycar {

	private String carName;
	private String carColor;
	private int carPrice;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public void getCarInfo() {
		System.out.println("자동차명: " + this.carName);
		System.out.println("차량가격: " + this.carPrice);
		System.out.println("차량색상: " + carColor);
	}

}// Mycar

public class ObTest_04 {

	public static void main(String[] args) {

		Mycar mc = new Mycar();
		mc.setCarName("제네시스");
		mc.setCarPrice(50000000);
		mc.setCarColor("화이트");

		System.out.println("[나의 자동차 정보]");
		mc.getCarInfo();

		System.out.println("\n[나의 새차 정보]");
		mc.setCarName("그랜저");
		mc.setCarPrice(40000000);
		mc.setCarColor("화이트");

		mc.getCarInfo();

	}

}
