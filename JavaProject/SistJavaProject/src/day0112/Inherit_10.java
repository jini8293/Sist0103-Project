package day0112;

class Work {
	public void goodmorning() {
		System.out.println("안녕하세요!!");
	}

	public void process() {
		System.out.println("아무것도 안하고있음!!!");

	}
}

class Food1 extends Work {
	@Override
	public void process() {
		System.out.println("***음식ㅣ담당***");
	}

}

class Clean extends Work {
	@Override
	public void process() {
		System.out.println("***청소ㅣ담당***");
	}

}

class Sing extends Work {
	@Override
	public void process() {
		System.out.println("***노래ㅣ담당***");
	}

}

public class Inherit_10 {

	public static void main(String[] args) {
		
		//다형성
		//부모클래스로 선언하고 자식클래스로 생성하는 경우
		Work work = null; //선언
		work = new Food1();
		
		work.goodmorning();
		work.process();
		System.out.println();

		work=new Clean();
		work.goodmorning();
		work.process();
		System.out.println();
		
		work=new Sing();
		work.goodmorning();
		work.process();
		
		
	}

}
