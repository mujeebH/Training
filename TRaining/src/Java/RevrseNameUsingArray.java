package Java;

public class RevrseNameUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="Bhoomika";
		char c[]=b.toCharArray();
		String r="";
		for(int i=0;i<c.length;i++) {
			r=c[i]+r;
		}
		System.out.println(r);
	}

}
