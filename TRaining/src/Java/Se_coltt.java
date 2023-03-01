package Java;

import java.util.HashSet;
import java.util.LinkedList;

public class Se_coltt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add(2);
		h.add(66);
		h.add(65);
		h.add(66);
		System.out.println(h);
		for(Object o:h)
			System.out.println(o);
		LinkedList l=new LinkedList(h);
		
	}

}
