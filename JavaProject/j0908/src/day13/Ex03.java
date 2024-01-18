package day13;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ex03 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:\\java\\mem.txt"));
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
