package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_03 {

	public static void fileWrite() {
		FileWriter fw = null;
		String fileName = "C:\\sist0103\\file\\test1.txt";

		try {
			fw = new FileWriter(fileName); // 파일 새로생성( 같은 이름이 있어도 새로 생성)

			// 파일에 내용추가
			fw.write("Have a Nice Day~~\n");
			fw.write("오늘은 수요일\n");
			fw.write(new Date().toString()+"\n"); // 문자열로 변환 -> toString()

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
	
	public static void fileWrite2() {
	
		FileWriter fr = null;
		String fileName = "C:\\sist0103\\file\\test1.txt";
		
		try {
			fr = new FileWriter(fileName,true); // true = >파일에 내용추가
			
			fr.write("내이름은 김지은\n");
			fr.write("--------------------------\n");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		fileWrite();
		fileWrite2();
	}

}
