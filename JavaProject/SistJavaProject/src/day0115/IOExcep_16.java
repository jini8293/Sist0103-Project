package day0115;

import java.io.IOException;
import java.io.InputStream;

//Strem: 바이트 단위로 처리
//writer, reader : 대부분 문자단위로 처리
//BufferReader: 해당 클래스는 스트링으로부터 데이터를 읽어올때 한줄씩 읽을 수 있는 readline()
//BufferWriter: flush()메소드를 호출해서 버퍼의 내용을 전송하는 작업이 추가로 필요함
public class IOExcep_16 {

	public static void main(String[] args) {
		InputStream is = System.in;// 콘솔에서 입력받기 위한 노드 스트림
		int a = 0;

		System.out.println("한글자 입력: ");
		try {
			a = is.read(); // 1byte 읽는 것 => 한글 못읽음 (최소 2byte여야 읽을 수 있음) / 리턴값은 아스키코드
		} catch (IOException e) {
			System.out.println("오류: " + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("***30초 뒤에 출력합니다***");

		try {
			Thread.sleep(3000); // => 3초뒤
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("입력값: " + (char) a); // char로 변경하면 문자값을 받을 수 있음 그냥 a쓰면 아스키코드로 받음
	}

}
