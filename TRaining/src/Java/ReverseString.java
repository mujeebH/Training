package Java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i live in bangalore";
		String []p=s.split(" ");
		String g="";
		for(int i=0;i<p.length;i++) {
			g=p[i]+" "+g;
		}
		System.out.println(g);
	}

}
