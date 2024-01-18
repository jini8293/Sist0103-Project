package day05;

abstract class Friends
{
	protected String name;
	protected String tel;
	protected String addr;
	public Friends(String name, String tel, String addr)
	{
		this.name=name;
		this.tel=tel;
		this.addr=addr;
	}
	public void showData()
	{
		System.out.print(name+" : "+tel+", "+addr);
	}
	//public void basicData(); //원래는 이렇게 아무 것도 정의되지 않은 메서드는 선언 불가
	abstract public void basicData(); //abstract 예약어를 사용하면 선언 가능(단, 클래스에도 abstract 사용해줘야함)
}



class Hifriend extends Friends{
	private String job;
	//부모클래스 생성자 자식 클래스 반드시 생성자 정의 == 부조생성자 호출
	public Hifriend(String name, String tel, String addr, String job) {
		super(name, tel, addr); //부모생성자 호출
		this.job=job;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("("+job+")");
	}
	
	//추상메서드 구현
	@Override
	public void basicData() {
		System.out.println(name+":"+tel);
	}
	
	
}



class Unifriend extends Friends{
	private String major;
	//부모클래스 생성자 자식 클래스 반드시 생성자 정의 == 부조생성자 호출
	public Unifriend(String name, String tel, String addr, String major) {
		super(name, tel, addr); //부모생성자 호출
		this.major=major;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("("+major+")");
	}
	
	//추상메서드 구현
		@Override
		public void basicData() {
			System.out.println(name+":"+tel+"("+major+")");
		}
	
}



public class FriendTest {

	public static void main(String[] args) {
		//객체형변환(상향형변환)
		Friends m1=new Hifriend("홍길동", "010-1111-1234", "서울", "간호사");
		Friends m2=new Hifriend("이순신", "010-1111-1235", "과천", "교사");
		Friends m3=new Unifriend("김고은", "010-1111-1236", "화성", "소프트융합");
		Friends[] m = {m1, m2, m3};
		for(Friends list:m) {
			list.showData();
		}
		System.out.println("----------기본 보기----------");
		for(Friends list:m) {
			list.basicData();
		}

	}

}
