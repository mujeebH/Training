package Java;

import java.util.LinkedList;

public class queue_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList ();
		a.add("hi");
		a.add('f');
		a.add(7);
		a.add(false);
		a.offer("ki");//que method for adding values
		a.offer("k");
		a.poll();
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
	}

}
