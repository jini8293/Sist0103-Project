package day0104;

import java.util.Calendar;

public class Calendar_12 {

	
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		String name = args[0];
		int curYear = c.get(c.YEAR);
		//Integer.parseInt: String->int 로 변환
		int mY = Integer.parseInt(args[1]);
		
		int tot = curYear - mY;
		
		System.out.printf("내 이름은 %s 현재 년도는 %d 내 나이는 %d", name, curYear, tot);
		

	}

}
