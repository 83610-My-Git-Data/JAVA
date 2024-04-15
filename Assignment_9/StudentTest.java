import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> stdList=new ArrayList();
		stdList.add(new Student(4, "aniket", 85));
		stdList.add(new Student(2, "anand", 90));
		stdList.add(new Student(1, "shantanu", 99));
		stdList.add(new Student(3, "shubham", 100));
		
		System.out.println("Before Sort --> ");
		for (Student student : stdList) {
			System.out.println(student);
		}
		
		System.out.println("After Natural Ordering--> ");
		Collections.sort(stdList);
		for (Student student : stdList) {
			System.out.println(student);
			
			
		}
		
		System.out.println("Sorting on Student name --> ");
		
		class StdNameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
				
			}
			
		}
		
		Comparator<Student> stdNameComparator=new StdNameComparator();
		Collections.sort(stdList, stdNameComparator);
		
		for (Student student : stdList) {
			System.out.println(student);
		}
		
		
		
		
		
		
		
		
	}
}
