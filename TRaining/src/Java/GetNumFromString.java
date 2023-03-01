package Java;

public class GetNumFromString {

	public static void main(String[] args) {
		String s="ELF42Feb25";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				int a=Integer.parseInt(s.charAt(i)+"");
				sum=sum+a;	
			}
		}
		System.out.println(sum);
	}
}
