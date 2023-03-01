package Java;

import java.util.Collections;

import java.util.LinkedList;

public class Emp implements Comparable {

	
		// TODO Auto-generated method stub
		String ename;
		double salary;
		int eid;
		Emp(String ename,double salary,int eid){
			this.ename=ename;
			this.salary=salary;
			this.eid=eid;
		}
		public String toString() {
			return "Name:"+this.ename+" "+"Salary:"+this.salary+" "+"Eid:"+this.eid;
		}
		public int compareTo(Object o){
			Emp e=(Emp)o;
			if(this.salary==e.salary)
				return 0;
			else if(this.salary>e.salary)
				return 1;
			else
				return -1;
		}
		public static void main(String[] args) {
			LinkedList<Emp> data=new LinkedList<>();
			data.add(new Emp("Anu",1000,3));
			data.add(new Emp("Anupam",10000,13));
			Collections.sort(data);
			for(Emp details:data) {
				System.out.println(details);
			}
	}

}
