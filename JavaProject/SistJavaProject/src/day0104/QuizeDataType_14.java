package day0104;

public class QuizeDataType_14 {

	public static void main(String[] args) {
		// 
		
		String  phone = args[0];
		int num = Integer.parseInt(args[1]);
		int charge = Integer.parseInt(args[2]);
		int tot = num*charge;
		
		System.out.println("상품명: " + phone);
		System.out.println("수량: " + num + "개");
		System.out.println("단가: " + charge + "원");
		System.out.println("총금액: " + tot + "원");
		
		
		
		

	}

}
