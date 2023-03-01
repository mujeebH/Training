package assignment;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello bye hello how bye how are you you";
		String []p=s1.split(" ");
		String s2="";
		for(int i=0;i<p.length;i++) {
			if(s2.contains(p[i])==false) {
				s2=s2+p[i]+" ";
			}	
		}
		System.out.println(s2);
	}

}
