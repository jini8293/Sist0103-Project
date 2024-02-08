package jcsg;

public class Rarr {
	static int[] marr() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}

	public static void main(String[] args) {
		int iarr[];
		iarr = marr();
		for(int i=0; i<iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
	}

}
