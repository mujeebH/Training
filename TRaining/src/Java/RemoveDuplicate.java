package Java;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		System.out.println(s.indexOf('h'));//-1
		System.out.println(s.indexOf('H'));//0
		System.out.println(s.indexOf('l'));//2
		System.out.println(s.lastIndexOf('l'));//3
		//using charAt method
		String s1="aabbccddeeff";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s2.indexOf(s1.charAt(i))==-1) {
				s2=s2+s1.charAt(i);
			}	
		}
		System.out.println(s2);
		//using tocharArray
		String s3="aaaabbb";
		char c[]=s3.toCharArray();
		String s4="";
		for(int i=0;i<s3.length();i++) {
			if(s4.indexOf(s3.charAt(i))==-1) {
				s4=s4+s3.charAt(i);
			}	
		}
		System.out.println(s4);
		}
	}

