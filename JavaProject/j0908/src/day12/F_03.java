package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class F_03 {

	public static void main(String[] args) {
		//out.txt 문서를 outcopy.txt로 복사해주세요
		try {
			FileInputStream in = new FileInputStream("c:\\java\\out.txt");
			FileOutputStream out = new FileOutputStream("c:\\java\\outcopy.txt");
			
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			out.close();
			in.close();
			System.out.println("복사완료");
		}catch (Exception e) {
			System.out.println("예외");
		}
			
		
		
	}

}
