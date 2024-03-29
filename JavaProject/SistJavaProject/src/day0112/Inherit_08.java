package day0112;

class Car {

	private String carCompany;// 제조회사
	private String carKind; // 차 종류

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}

	public Car() {
		this("현대", "전기차");
	}

	public Car(String ccom, String ck) {
		this.carCompany = ccom;
		this.carKind = ck;
	}

	// 출력
	public void writeData() {
		System.out.println("회사명: " + carCompany);
		System.out.println("종류: " + carKind);
	}

}// Car

class MyCar extends Car {

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

	public MyCar() {
		carName = "아이오닉5";
		carColor = "블랙";
		carPrice = 35000000;
	}

	public MyCar(String ccom, String ck, String cname, String cc, int cp) {
		super(ccom, ck);
		this.carName = cname;
		this.carColor = cc;
		this.carPrice = cp;
	}

	@Override
	public void writeData() {
		super.writeData();
		System.out.println("자동차명: " + carName);
		System.out.println("색상: " + carColor);
		System.out.println("가격: " + carPrice);
	}

}// MyCar

public class Inherit_08 {

	public static void main(String[] args) {

		MyCar mc1 = new MyCar();
		System.out.println("**디폴트 생성자로 생성**");
		mc1.writeData();

		MyCar mc2 = new MyCar("기아", "가솔린", "코나", "화이트", 25000000);
		System.out.println("**\n명시적 생성자로 생성**");
		mc2.writeData();

	}

}
