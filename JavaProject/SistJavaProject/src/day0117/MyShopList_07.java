package day0117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShopList_07 {

	static final String FILENAME = "C:\\sist0103\\file\\myshop.txt";
	List<MyShop> list = new ArrayList<MyShop>();
	Scanner s = new Scanner(System.in);

	public MyShopList_07() {
		// shopFileRead();// 생성과 동시에 하게됨 -> 이게 뭐임? 이거 없으면 파일 내용을 못불러옴
	}

	// 파일 읽기
	public void shopFileRead() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while (true) {
				String shop = br.readLine();

				if (shop == null) {
					break;
				}
				String[] data = shop.replace("\uFEFF", "").split(",");

				String sang = data[0];
				int su = Integer.parseInt(data[1].trim());
				int price = Integer.parseInt(data[2].trim());
				int total = su * price;

				// MyShop클래스에 저장 #1
				/*
				 * MyShop s = new MyShop();//디폴트 생성
				 * 
				 * s.setSangpum(sang); s.setSu(su); s.setPrice(price); s.setTotal(total);
				 */

				// MyShop클래스에 저장 #2
				MyShop s = new MyShop(sang, su, price);
				s.setTotal(total);

				// 리스트에 추가
				list.add(s);
			}
			System.out.println("파일에서 총 " + list.size() + "개의 상품목록을 가져왔음");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// 파일에 쓰기
	public void shopFileWrite() {
		FileWriter fw = null;

		try {
			fw = new FileWriter(FILENAME);

			// MyShop클래스의 내용을 얻어서 출력
			for (MyShop shop : list) {
				String s = shop.getSangpum() + "," + shop.getSu() + "," + shop.getPrice() + "\n";
				fw.write(s);

			}
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

	// MyShop입력
	public void shopAdd() {
		System.out.print("추가할 상품명을 입력하세요: ");
		String sang = s.nextLine();
		System.out.print("수량을 입력하세요: ");
		int su = Integer.parseInt(s.nextLine());
		System.out.print("가격을 입력하세요: ");
		int price = Integer.parseInt(s.nextLine());

		// MyShop클래스가 생성
		MyShop shop = new MyShop(sang, su, price);
		shop.setTotal(su * price);

		// list에 shop추가
		list.add(shop);
		System.out.println("**상품정보가 추가되었습니다**");
	}

	// 상품 삭제
	public void sangpumDelete() {
		// 상품명 입력후 있을경우 삭제
		// 있을땐 삭제됨 없을땐 해당상품이 없습니다
		String sang = "";
		System.out.println("삭제할 상품명을 입력하세요");
		sang = s.nextLine();

		boolean flag = false;// 있는지 없는지 찾을때

		// 같은 상품이 여러개일때 모두 삭제되려면 긑에서부터 반복문 돌린다
		// 앞에서부터 삭제시 남은상품 인덱스가 바뀐다
		for (int i = list.size() - 1; i >= 0; i--) {
			MyShop shop = list.get(i);

			if (shop.getSangpum().equals(sang)) {
				flag = true;
				list.remove(i);
			}

		}
		if (flag) {
			System.out.println("상품이 삭제됨");
		} else {
			System.out.println("해당 상품이 없습니다");
		}

	}

	// 파일 삭제
	public void deleteAllDatas() {
		File file = new File(FILENAME);

		if (file.exists()) {
			file.delete();
		}
		System.out.println("**파일이 삭제되었습니다.**");
	}

	// 파일 전체 출력
	public void shopAllDatas() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		int no = 1;

		if (list.size() == 0) {
			System.out.println("**출력할 상품이 없습니다**");
			return; // 현재메서드 종료
		}
		// 제목출력
		System.out.println("\t**전체 상품 정보**");
		System.out.println();
		System.out.println("번호\t상품명\t수량\t가격\t총금액");
		System.out.println("-----------------------------------");

		for (MyShop s : list) {
			System.out.println(
					no++ + "\t" + s.getSangpum() + "\t" + s.getSu() + "\t" + s.getPrice() + "\t" + s.getTotal());
		}

	}

	// 파일 실행
	public void process() {

		int num = 0;
		while (true) {
			System.out.println("[ㅁㅔ뉴]1.상품추가		2.상품출력		3.상품삭제		4.상품검색		9.종료");
			num = Integer.parseInt(s.nextLine());
			if (num == 1) {
				System.out.println("상품 정보를 추가합니다");
				this.shopAdd();

			} else if (num == 2) {
				this.shopAllDatas();

			} else if (num == 3) {
				this.sangpumDelete();

			} else if (num == 4) {
				this.shopSerch();

			} else if (num == 9) {
				System.out.println("Shop정보를 저장후 종료합니다");
				this.shopFileWrite();
				System.exit(0);
				// break;
			} else {
				System.out.println("번호를 확인후 다시 입력해주세요");
			}
		}
	}

	// 상품검색
	public void shopSerch() {
		// 상품 입력하면 상품정보 출력
		// 없을경우 해당상품 없다

		System.out.println("검색할 상품명 입력");
		String sang = s.nextLine();
		boolean flag = false;// 있는지 없는지 찾을때

		System.out.println("***검색 결과***");

		for (MyShop shop : list) {
			if (shop.getSangpum().contains(sang)) {
				flag = true;
				System.out.println("상품명: " + shop.getSangpum());
				System.out.println("수량: " + shop.getSu());
				System.out.println("가격: " + shop.getPrice());
				System.out.println("총금액: " + shop.getTotal());
				System.out.println("------------------------------------------");
			}
		}
		if (!flag) {
			System.out.println("해당 상품은 없습니다.");
		}

	}

	public static void main(String[] args) {
		MyShopList_07 my = new MyShopList_07();
		my.process();
	}

}
