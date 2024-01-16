package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFileException_15 {
	public static void fruitshop() throws FileNotFoundException, IOException {
		String fName = "C:\\sist0103\\file\\fruitshop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int cnt = 0;
		
		int tot = 0;
		try {
			fr = new FileReader(fName);
			br = new BufferedReader(fr);

			System.out.println("**과일 입고 목록**");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("-------------------------------------");

			// br.readLine();
			while (true) {
				String s = br.readLine();
				if (s == null) {
					break;
				}

				cnt++;
				//String[] data = s.replace("\uFEFF", "").split(",");
				//tot = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
				//System.out.println(cnt + "\t" + data[0] + "\t" + data[1] + "\t" + data[2] + "\t" + tot);
				StringTokenizer st = new StringTokenizer(s.replace("\uFEFF", ""), ",");
				String name =st.nextToken();
				int su = Integer.parseInt(st.nextToken());
				int dan = Integer.parseInt(st.nextToken());
				tot = su*dan;
				System.out.println(cnt + "\t"+name+"\t"+su+"\t"+dan+"\t"+tot);
				

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			fruitshop();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
