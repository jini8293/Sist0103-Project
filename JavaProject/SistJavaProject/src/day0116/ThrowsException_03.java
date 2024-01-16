package day0116;

import java.util.Scanner;

//강제 예외 발생 throw
class UserException extends Exception {

	public UserException(String msg) {
		super(msg); // Exception클래스 생성자 통해 정식 메세지로 등록
	}
}

public class ThrowsException_03 {

	public static void process() throws UserException {
		Scanner s = new Scanner(System.in);
		int age = 0;

		// 나이가 10~59가 아니면 UserException이 강제 발생
		System.out.println("나이를 입력해주세요");
		age = s.nextInt();

		if (age < 10 || age >= 60) {
			throw new UserException("우리모임의 나이는 10~59세 입니다");
		} else {
			System.out.println("당신은" + age + "세 이므로 멤버로 등록이 가능합니다");

		}
	}

	public static void main(String[] args) {

		try {
			process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
