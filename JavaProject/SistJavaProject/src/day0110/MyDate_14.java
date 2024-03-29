package day0110;

class MyDate {

	private int year;
	private int month;
	private int day;

	// 디폴트 생성자

	
	//명시적 생성자_생성과 동시에 초기화(=수정)가 가능
	public MyDate(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public MyDate() {
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	

}

public class MyDate_14 {

	public static void main(String[] args) {
		MyDate m1 = new MyDate(2024, 01, 10); 
		
		int y = m1.getYear();
		int m = m1.getMonth();
		int d = m1.getDay();
		
		System.out.println(y+"-"+m+"-"+d);
		
		MyDate m2 = new MyDate();
		
		m2.setYear(2022);
		m2.setMonth(9);
		m2.setDay(11);
		
		int y2 = m2.getYear();
		int m3 = m2.getMonth();
		int d2 = m2.getDay();
		
		System.out.println(y2+"년-"+m3+"월-"+d2+"일");
		
		
		
		
		
	}

}
