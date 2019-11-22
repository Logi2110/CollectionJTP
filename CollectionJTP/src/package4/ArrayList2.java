package package4;
import java.util.*;

public class ArrayList2 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(101,"Logi","E&I");
		Student s2=new Student(102,"Gopi","CSE");
		Student s3=new Student(103,"Surya","EEE");

		ArrayList<Student> al=new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st); 
			System.out.println(st.id+" "+st.name+" "+st.dept);
		}
		
		// for-each loop
		
		for(Student s:al)
		{
			System.out.println(s); 
			System.out.println(s.id+" "+s.name+" "+s.dept);
		}
		
	}

}
