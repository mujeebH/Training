package Java;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=132;
		int count=0;
		int sum=0;
		for(int j=i;j>0;j=j/10) {
			count++;
		}
		for(int k=i;k>0;k=k/10) {
			int r=k%10;
			sum=(int) (sum+Math.pow(r, count));
		}
		System.out.println(sum);	
	}

}
