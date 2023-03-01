package Java;

public class Asgn2 {

	public static void main(String[] args) {
		/* 
		@ABCD
		1@ABC
		12@AB
		123@C
		 */
		
		for(int i=0;i<5;i++) {
			int j=1;
			char c='A';
			for(int k=0;k<5;k++) {
				if(i==k) {
					System.out.print("@");
				}
				else if(i<=k) {
					System.out.print(c++);
				}
				else {
					System.out.print(j++);
				}
			}
		System.out.println();
			
	}
}
}
