package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fWriter_04 {

	Scanner s;
	FileWriter fw;
	static final String FILENAME = "C:\\sist0103\\file\\member.txt";

	public fWriter_04() {
		s = new Scanner(System.in);

	}

	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true);

			// 키보드로 이름, 주소, 핸드폰 번호 입력후 파일에 저장
			System.out.print("이름 입력:");
			String name = s.nextLine();
			System.out.print("주소 입력:");
			String addr = s.nextLine();
			System.out.print("연락처 입력:");
			String hp = s.nextLine();

			System.out.println("**파일이 저장되었습니다**");

			// 파일에 저장
			fw.write("회원명: " + name + "\n");
			fw.write("주소: " + addr + "\n");
			fw.write("연락처: " + hp + "\n-------------------------\n");

		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		fWriter_04 fr = new fWriter_04();
		fr.dataWrite();
	}

}
