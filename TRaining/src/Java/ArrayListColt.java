package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListColt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add('f');
		a.add(7);
		a.add(false);
		System.out.println(a);
		
		for(Object o:a)//for each loop
		System.out.println(o);
		
		for(int i=0;i<a.size();i++)//for loop
			System.out.println(a.get(i));
		
		//iterator
		Iterator i=a.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//List iterator
		ListIterator i1=a.listIterator(a.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
	}
}
