package day12;

import java.io.FileInputStream;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("c:\\java\\input.txt");
			int c;
			while((c=in.read())!=-1) {

				System.out.print((char)c);
			}
			in.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("입출력오류");
		}
	}

}
