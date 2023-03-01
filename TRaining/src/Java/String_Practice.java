package Java;

public class String_Practice {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		/*String s=new String("hi");
		System.out.println(s.concat("All"));
		System.out.println(s);
		s=s.concat("All");
		System.out.println(s);
		String v="hi";
		System.out.println(v);
		v=v+"bye";
		System.out.println(v);*/
		
		//reverse the string
		String s1="Hello";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		
		//tolower & upper case
		String s3="chan";
		s3=s3.toLowerCase();
		System.out.println(s3);
		s3=s3.toUpperCase();
		System.out.println(s3);
		
		//substring
		String s4="chandraDevi";
		System.out.println(s4.substring(7));
		System.out.println(s4.substring(2, 7));
		
		//Frst letter in uppercase
		String s5="sanjeev";
		s5=s5.substring(0, 1).toUpperCase()+s5.substring(1);
		System.out.println(s5);
		
		//
	}

}
