package day04;

class Friend
{
	private String name;
	private String tel;
	private String addr;
	public Friend(String name, String tel, String addr)
	{
		this.name=name;
		this.tel=tel;
		this.addr=addr;
	}
	public void showData()
	{
		System.out.print(name+" : "+tel+", "+addr);
	}
}



class Hifriend extends Friend{
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
	
}



class Unifriend extends Friend{
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
	
}



public class FriendTest {

	public static void main(String[] args) {
		//객체형변환(상향형변환)
		Friend m1=new Hifriend("홍길동", "010-1111-1234", "서울", "간호사");
		Friend m2=new Hifriend("이순신", "010-1111-1235", "과천", "교사");
		Friend m3=new Unifriend("김고은", "010-1111-1236", "화성", "소프트융합");
		Friend[] m = {m1, m2, m3};
		for(Friend list:m) {
			list.showData();
		}

	}

}
