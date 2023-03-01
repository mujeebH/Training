package Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet h=new TreeSet();
		h.add(2);
		h.add(66);
		h.add(65);
		h.add(66);
		System.out.println(h);
		Iterator i=h.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println(h.descendingSet());
	}

}
