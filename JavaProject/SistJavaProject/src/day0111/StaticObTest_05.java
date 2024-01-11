package day0111;

class Member {
	private String stuName;
	private String stuGender;
	private String stuAddr;
	
	static String ban;
	static int cnt=0;
	
	

	//멤버 메서드
	public void setMemberData(String name, String gender, String addr) {
		this.stuName=name;
		this.stuGender=gender;
		this.stuAddr=addr;
		
	}
	
	public void writeMemberData() {
		cnt++;
		System.out.println("**학생 "+cnt+ " 정보**");
		System.out.println("소속학급: "+Member.ban);
		System.out.println("학생 이름: " + this.stuName);
		System.out.println("학생 성별: " + this.stuGender);
		System.out.println("학생 주소: " + this.stuAddr);
		System.out.println("-------------------------");
	}
	
	
}

public class StaticObTest_05 {

	public static void main(String[] args) {
		Member mb = new Member();
		mb.setMemberData("홍길동","남자","서울시");
		Member.ban="쌍용교육세넡 JAVA반";
		mb.writeMemberData();
		
		Member mb2 = new Member();
		mb2.setMemberData("이효리","여자","화성시");
		mb2.writeMemberData();

	}

}
