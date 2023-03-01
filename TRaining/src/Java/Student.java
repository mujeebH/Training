package Java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student {
	String s_name;
	int s_rollno;
	double s_percent;
	String s_class;
	Student(String s_name,int s_rollno,double s_percent,String s_class){
		this.s_name=s_name;
		this.s_rollno=s_rollno;
		this.s_percent=s_percent;
		this.s_class=s_class;
	}
	public String toString() {
		return "Name:"+this.s_name+" "+"RollNo:"+this.s_rollno+" "+"Percent:"+s_percent+" "+"Class"+this.s_class;
	}
	
	public int compareTo(Object o){
		Student e=(Student)o;
		if(this.s_percent==e.s_percent)
			return 0;
		else if(this.s_percent>e.s_percent)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		LinkedList<Student> data=new LinkedList<>();
		data.add(new Student("Anu",3,86,"A"));
		data.add(new Student("Anupam",13,96,"A+"));	
		
		data.add(new Student("Nitin",30,89,"A"));
		data.add(new Student("Anur",63,56,"B"));
		Collections.sort(data);
		for(Student details:data) {
			System.out.println(details);
		}
}

}
nm