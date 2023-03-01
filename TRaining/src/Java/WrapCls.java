package Java;

public class WrapCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer a1=Integer.valueOf(a);//boxing(before jdk 1.5
		System.out.println(a1);
		
		Integer b=a;//auto boxing
		System.out.println(b);
		
		Integer c=20;
		int c1=c.intValue();//unboxing
		System.out.println(c1);
		
		Double d=5678.6;
		double d1=d;//auto unboxing
		System.out.println(d1);
		
		String s="10";
		int s1=Integer.parseInt(s);
		System.out.println(s1);
		
		String d2="2.3";
		double d3=Double.parseDouble(d2);
	}

}
