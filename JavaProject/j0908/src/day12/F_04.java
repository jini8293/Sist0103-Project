package day12;

import java.io.FileReader;
import java.io.IOException;

public class F_04 {
	public static void main(String[] args) throws IOException {
		//FileReader
		FileReader fr = new FileReader("c:\\java\\out.txt");
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		

	}

}
