package Java;

import java.util.ArrayList;
import java.util.Stack;

public class ListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add('f');
		a.add(7);
		a.add(false);
		System.out.println(a);//additionof elements
		a.remove(0);
		a.add(2, 'u');
		a.set(3, true);
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.add("hi");
		a1.add('f');
		a1.add(7);
		a1.add(false);
		a1.retainAll(a);
		System.out.println(a1);
		a.removeAll(a1);
		System.out.println(a);
		Stack s=new Stack();
	}
	
	

}
