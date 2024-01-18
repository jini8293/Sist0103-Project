package day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

public class Ex05 {

	public static void main(String[] args) {
		try {
			//보통 데이터 단위로 쓸땐 확장자를 bean으로 줌. txt는 파일이 깨지기 때문
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("c:\\java\\data.txt"));
			dout.writeBoolean(false);
			dout.writeDouble(3.14);
			dout.writeInt(10);
			dout.writeUTF("화이팅");
			dout.flush();
			
			DataInputStream din = new DataInputStream(new FileInputStream("c:\\java\\data.txt"));
			System.out.println(din.readBoolean());
			System.out.println(din.readDouble());
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
			
			din.close();
			dout.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
