package day0109;

public class java {

	public static void main(String[] args) {
		String[] name = { "홍수연", "김수연", "최수연", "민수연" };
		int[] kor = { 90, 88, 100, 78 };
		int[] eng = { 100, 55, 100, 87 };
		int[] mat = { 44, 55, 100, 66 };
		int[] tot = new int[4];
		double[] avg = new double[4];
		int[] rank=new int[4];

		for (int i = 0; i < name.length; i++) {
			tot[i] += kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
		}
		for (int i = 0; i < name.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < name.length; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}

		// 3. 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("=================================================================");

		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i]
					+ "\t" + avg[i] + "\t" + rank[i]);

		}
	}

}
