package Java;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet a=new LinkedHashSet<>();
		a.add("hi");
		a.add('f');
		a.add(7);
		a.add(false);
		Iterator i=a.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

	
}
