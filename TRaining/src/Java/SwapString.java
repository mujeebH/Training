package Java;

public class SwapString {

	public static void main(String[] args) {
		//Swaping Strings without using 3rd variable
		String s1="Hello";
		String s2="All";
		int len=s1.length();
		s1=s1+s2;
		s2=s1.substring(0, len);
		s1=s1.substring(len);
		System.out.println(s1);
		System.out.println(s2);
	}

}
