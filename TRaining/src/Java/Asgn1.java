package Java;

public class Asgn1 {

	public static void main(String[] args) {
		//frst letter of evry wrd shld be capital
		String s="hello how are you";
		String v="";
		String b[]=s.split(" ");
		for(int i=0;i<b.length;i++) {
			String s5=b[i].substring(0, 1).toUpperCase()+b[i].substring(1);
			v=v+s5+" ";
		}
		System.out.println(v);
	}

}
