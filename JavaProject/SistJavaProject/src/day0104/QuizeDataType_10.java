package day0104;

public class QuizeDataType_10 {

	public static void main(String[] args) {
		// 변수는 args를 이용

		String name = args[0];
		String area = args[1];
		int age = Integer.parseInt(args[2]);

		int java = Integer.parseInt(args[3]);
		int oracle = Integer.parseInt(args[4]);
		int tot = java + oracle;

		System.out.println("학생명: " + name + " 님");
		System.out.println("지역: " + area + " 님");
		System.out.println("나이: " + age + " 세\n");
		System.out.println("===========================");
		System.out.printf("%s님의 자바점수는 %d점 오라클점수는 %d점  총 %d점 입니다.", name, java, oracle, tot);

	}

}
