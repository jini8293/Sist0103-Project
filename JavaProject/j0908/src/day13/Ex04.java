package day13;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex04 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\buffer.txt"));
			bw.write("자바의 버퍼를 학습하고 있습니다");
			bw.newLine();
			bw.write("오늘은 즐거운 금요일입니다.");
			bw.newLine();
			bw.write("빨랑 종강하자~");
			bw.newLine();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
