package arraylist1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		final int MAX_VAL = 10000;
		List<Integer> llistaEnllasada = new LinkedList<Integer>();
		List<Integer> llistaArray = new ArrayList<Integer>();
		for(int i = 0; i < MAX_VAL; i++) {
			llistaEnllasada.add(i);
			
			llistaArray.add(i);

		}
		llistaEnllasada.get(9999);
		llistaArray.get(9999);
		long time = System.nanoTime();
		for (int i = 0; i < MAX_VAL; i++) {
			llistaEnllasada.add(MAX_VAL, i);
			
			/*linkedList.add(5000, 11);*/
			/*llistaEnllasada.add(10000, 11);*/
			
		}
		System.out.println("LL time: " + (System.nanoTime() - time));
		time = System.nanoTime();
		for (int i = 0; i < MAX_VAL; i++) {
			llistaArray.add(MAX_VAL, i);
			/*arrayList.add(5000, 22);*/
			/*llistaArray.add(10000, 22);*/
			
		}
		System.out.println("AL time: " + (System.nanoTime() - time));
		
	}

}
