package Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMap_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap h = new TreeMap();
			h.put(7, 'k');
			//h.put('k','l');//we get classcast execption 
			//h.put(null, 8); NullPointerException
			h.put(7,'s');
	
		System.out.println(h);
		LinkedHashMap l=new LinkedHashMap();
		l.put(4,9);
		l.put(8,'i');
		l.put(4, 6);
		l.put(7, 9);
		l.put('k',9);
		System.out.println(l);
	}

}
