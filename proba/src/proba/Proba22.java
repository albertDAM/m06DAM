package proba;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Proba22 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
		
		for (int i = 0; i<list.size(); i++) {
			
			//System.out.println(list.get(i).toString());
			list.get(i);
			list.set(i, (int) (Math.pow(i, 2)));
			System.out.println(list.get(i));	
		}
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			
			if (itr.next() > 100) {
				itr.remove();
			}
		}
		System.out.println(list);
		
		
		if (list.isEmpty()) {
			System.out.println("Esta buida");
		}else {
			System.out.println("Conté coses");
		}

		Collections.sort(list);
		System.out.println(list);
		
		
		for (int i=0; i < 20; i++) {
			list2.add(i);
		}
			list.addAll(list2);
			
			System.out.println(list);
		
			for (Integer elements: list) {
				System.out.println(elements.toString());
			}
			
			for (Integer elements:list2) {
				if (list.contains(elements))System.out.println("Existeix");
			}
			list2.clear();
			if (list2.isEmpty())System.out.println("Esta buida");
			
			
			
			
			
		/*for (int i=0; i < list.size(); i++) {
			
			boolean state = list.contains(list2);
			System.out.println(state);
		}*/
			
		
	}

}
