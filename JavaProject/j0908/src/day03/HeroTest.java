package day03;
//Hero 상위클래스 정의 : 멤버변수 : 이름(name) : private 접근제한 생성자초기화
//Move() 메서드 정의 name 출력
//Batman, Superman, Spiderman 서브클래스 : super() 무기(level) 추가
//Move() 오버라이딩 : '배트맨이 오토바이로 이동' 출력
//Hero 객체배열을 초기화하여 한꺼번에 출력

class Hero{
	private String name;
	
	public Hero(String name) {
		this.name=name;
	}
	public void Move() {
		System.out.print(name+" ");
	}
}

class Batman extends Hero { //부모 클래스가 생성자로 정의되어 있으면 상속 받은 자식은 반드시 생성자로 정의
	private String level;
	public Batman(String name, String level) { //부모 생성자 호출
		super(name);
		this.level=level;
	}
	@Override
	public void Move() {
		super.Move();
		System.out.println(level+" 이동");
	}
}

class Superman extends Hero { //부모 클래스가 생성자로 정의되어 있으면 상속 받은 자식은 반드시 생성자로 정의
	private String level;
	public Superman(String name, String level) { //부모 생성자 호출
		super(name);
		this.level=level;
	}
	@Override
	public void Move() {
		super.Move();
		System.out.println(level+" 이동");
	}
}

class Spiderman extends Hero { //부모 클래스가 생성자로 정의되어 있으면 상속 받은 자식은 반드시 생성자로 정의
	private String level;
	public Spiderman(String name, String level) { //부모 생성자 호출
		super(name);
		this.level=level;
	}
	@Override
	public void Move() {
		super.Move();
		System.out.println(level+" 이동");
	}
}



public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1=new Batman("배트맨","오토바이");
		Hero h2=new Superman("슈퍼맨","망토");
		Hero h3=new Spiderman("스파이더맨","거미줄");
		
		Hero[] h = {h1, h2, h3};
		
		for(Hero list:h) {
			list.Move();
		}

	}

}
