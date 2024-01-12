package day0112;

//클래스를 객체 생성할 때는 자동으로 부모=>자식순 그래야 자식이 부모의 멤버를 사용할 수 있음 
public class MainEmp_04 {

	public static void main(String[] args) {
		
		Manager_04 man = new Manager_04("김선호", 300000, "IT기획");
		System.out.println(man.getEmployee());
		
		

	}

}
