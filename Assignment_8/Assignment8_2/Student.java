package pkg;

public class Student implements Comparable<Student>
{
	private int rollNo;
	String city;
	String name;
	double marks;
	
	
	public Student() 
	{
	
	}


	public Student(int rollNo, String city, String name, double marks) 
	{
		this.rollNo = rollNo;
		this.city = city;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", city=" + city + ", name=" + name + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		int value=this.rollNo-o.rollNo;
		if(value>0)
			return 4;
		else 
			return -1;
		
	}
	

	
	
	
	

}