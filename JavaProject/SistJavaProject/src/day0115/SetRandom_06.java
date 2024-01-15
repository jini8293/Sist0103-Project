package day0115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;



public class SetRandom_06 {

	public static void main(String[] args) {
		// Set, random이용해서 1~45의 서로다른 난수 6개
		
		Random r = new Random();
		Set<Integer> set1 = new HashSet<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			set1.add(n);
			
			if(set1.size()==6) {
				break;
			}
		}
			
			System.out.println("출력_#1");
			for (int i:set1) {
				System.out.printf("%5d",i);
			}
			System.out.println();
			///////////////////////////
			System.out.println("출력_#2");
			Iterator<Integer> iter= set1.iterator();
			
			while(iter.hasNext())
			{
				System.out.printf("%5d",iter.next());
			}
			System.out.println();
			///////////////////////////
			System.out.println("출력_#3");
			Object [] ob = set1.toArray();
			Arrays.sort(ob); //배열값 오름차순
			for(int i=0;i<ob.length;i++) {
				System.out.printf("%5d",ob[i]);
			}
			
			System.out.println();
		

	}

}
