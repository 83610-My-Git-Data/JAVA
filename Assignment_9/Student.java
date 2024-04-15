
public class Student implements  Comparable<Student>{
	
	int rollno;
	String name;
	double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else if(this == obj) {
			return true;
		}
		else if(obj instanceof Student) {
			Student s=(Student) obj;
			return s.rollno==this.rollno;
		}
		
		
		
		return false;
		
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno- o.rollno;
		
	}
	 
	
}
