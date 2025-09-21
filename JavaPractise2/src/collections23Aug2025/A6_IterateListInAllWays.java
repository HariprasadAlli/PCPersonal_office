package collections23Aug2025;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A6_IterateListInAllWays {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String fruit: list) {
			System.out.println(fruit);
		}
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nlist iterator");
		ListIterator<String> listiterator = list.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		
		System.out.println("\nPrevious list iterator");
		
		for(int i = list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		
		//or
		ListIterator<String> listiterator1 = list.listIterator(list.size());
		while(listiterator1.hasPrevious()) {
			System.out.println(listiterator1.previous());
		}
		
		

	}

}
