package day13;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아 mem.txt에 작성
		// 단, 계속 반복하고, 입력을 종료하고 싶으면 quit 입력
		// mem.txt의 출력형태는 "아이디 : oh 비밀번호 : 1234"
		try {
			FileWriter fw = new FileWriter("c:\\java\\mem.txt");
			Scanner s = new Scanner(System.in);
			
			/*
			while(true) {
				String id=null, pwd=null;
				
				System.out.print("아이디를 입력하세요:");
				id=s.next();
				if(id.equals("quit")) {
					break;
				}
				System.out.print("비밀번호를 입력하세요:");
				pwd=s.next();
				String idpwd="아이디: "+id+" 비밀번호: "+pwd+"\n";
				fw.write(idpwd);
				
			}
			*/
			
			boolean quit = false;
			while(!quit) {
				System.out.print("아이디 입력 : ");
				String id = s.next();
				fw.write("아이디:"+id);
				System.out.print("비밀번호 입력 : ");
				String pwd = s.next();
				fw.write(" 비밀번호:"+pwd+"\n");
				System.out.print("계속 진행 (Y,N) : ");
				String str = s.next();
				if(str.toUpperCase().equals("N")) {
					quit=true;
				}
			}
			
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
