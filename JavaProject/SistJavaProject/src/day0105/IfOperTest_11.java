package day0105;

public class IfOperTest_11 {

	public static void main(String[] args) {
		// 삼항연산자
		// 구하려는 값 = 수식1? "참" : "거짓"

		// if문과 삼항연산자 비교

		int sc = 99;
		String gr; // 학점

		if (sc >= 90) {
			gr = "A";
		} else if (sc >= 80) {
			gr = "B";
		} else if (sc >= 70) {
			gr = "C";
		} else if (sc >= 60) {
			gr = "D";
		} else {
			gr = "F";
		}

		// gr = sc >= 90 ? "A" : sc >= 80 ? "B" : sc >= 70 ? "C" : sc >= 60 ? "D" : "F";

		switch (sc / 10) {
		case 10:
		case 9:
			gr = "A";
			break;
		case 8:
			gr = "B";
			break;
		case 7:
			gr = "C";
			break;
		case 6:
			gr = "D";
			break;
		default:
			gr = "F";
			break;
		}

		System.out.println("학점은 " + gr + "입니다.");

	}

}
