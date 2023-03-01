package Java;

import java.util.HashMap;
import java.util.Iterator;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  String s="hello"; 
		  HashMap h=new HashMap(); 
		  int k=0; 
		  for(int i=0;i<s.length();i++) {
		  
		  h.put(s.charAt(i), k++ ); } System.out.println(h);
		 */
		String s = "hello";
		char c[] = s.toCharArray();
		HashMap h = new HashMap();
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			k = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					k++;
				}
			}
			h.put(c[i], k);
		}
		System.out.println(h);
	}

}
