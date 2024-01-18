package day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F_05 {

	public static void main(String[] args) throws IOException {
		//out.txt로 copy.txt로 FileReader와 FileWrite 클래스를 사용해 복사해주세요
		FileReader fr = new FileReader("c:\\java\\out.txt");
		FileWriter fw = new FileWriter("c:\\java\\copy.txt");
		
		int c;
		while((c=fr.read())!=-1) {
			fw.write(c);
		}
		fr.close();
		fw.close();

	}

}
