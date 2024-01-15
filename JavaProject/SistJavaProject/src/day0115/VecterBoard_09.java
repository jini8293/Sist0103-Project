package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VecterBoard_09 {

	List<Board_09> list = new Vector<Board_09>();
	// 제네릭 유형을 ㅡㄹ래스로 지정했으므로 데이터를 꺼내고 받을때도 클래스여야함

	// 입력메서드
	public void inputData() {
		Scanner s = new Scanner(System.in);
		String writer, subject, content;

		System.out.print("작성자 명: ");
		writer = s.nextLine();

		System.out.print("제목: ");
		subject = s.nextLine();

		System.out.print("내용: ");
		content = s.nextLine();

		Board_09 data = new Board_09(writer, subject, content);
		list.add(data);

		System.out.println("현재 데이터 갯수 : " + list.size() + "개");
	}

	// 출력메서드
	public void writeData() {
		System.out.println("**IT교재 목록**");
		System.out.println("=======================================");
		for (int i = 0; i < list.size(); i++) {
			Board_09 b = list.get(i);
			System.out.println("No."+(i+1)+"\n작성자: " +b.getWriter());
			System.out.println("제목: " +b.getSubject());
			System.out.println("내용: " +b.getContent());
			System.err.println("------------------------------------------------------");
		}
	}

	public static void main(String[] args) {

		VecterBoard_09 vt = new VecterBoard_09();
		Scanner s = new Scanner(System.in);

		int n;

		while (true) {
			System.out.println("1.입력\t2.출력\t9.종료");
			n = Integer.parseInt(s.nextLine());
			if (n == 1) {
				vt.inputData();
			}else if (n==2) {
				vt.writeData();
			} else if (n == 9) {
				System.out.println("***종료합니다***");
				break;
			}

		}

	}

}
