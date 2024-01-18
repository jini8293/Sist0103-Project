package day12;

import java.io.FileOutputStream;
import java.io.IOException;

public class F_02 {

	public static void main(String[] args) {
		

		try {
			// abstract void write(int b)
			FileOutputStream out = new FileOutputStream("c:\\java\\out.txt");
			String str = "이 문자를 파일에 쓰고 싶습니다.";
			byte[] buf = str.getBytes();
			out.write(buf);
			out.close();
			System.out.println("파일쓰기 완료");
		}catch (IOException e) {
			System.out.println("예외");
		}
		
	}

}
