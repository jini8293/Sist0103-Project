package day0115;

public class Exception_12 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		try {// 예외가 발생할수있는 코드
			int num = 3 / 0; // 정수를 0으로 나누면 나오는 에러
		} catch (ArithmeticException e) { // 예외 처리 코드 넣기
			e.printStackTrace(); // 자세한 예외 정보 출력

		}

		System.out.println("프로그램 종료");

	}

}
