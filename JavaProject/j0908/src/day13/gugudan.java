package day13;

import java.io.FileOutputStream;

public class gugudan {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("c:\\java\\gugudan.txt");
			
			
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
					String str=i+"*"+j+"="+i*j+"\n";
					byte[] b = str.getBytes();//이 부분 빈칸으로 출제
					out.write(b);
				}
			System.out.println("\n");	
			}
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
