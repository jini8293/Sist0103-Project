package day0115;

public class Shop {

	private String sangname;
	private int su, dan;
	
	//합계
	public int getTot() {
		int t = su*dan;
		return t;
	}

	// 디폴트 생성자
	public Shop() {

	}

	// 명시적 생성자
	public Shop(String sangname, int dan, int su) {
		this.sangname = sangname;
		this.su = su;
		this.dan = dan;
	}

	public String getSangname() {
		return sangname;
	}

	public void setSangname(String sangname) {
		this.sangname = sangname;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

}
