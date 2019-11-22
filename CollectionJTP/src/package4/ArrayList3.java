package package4;
import java.util.ArrayList;

public class ArrayList3 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();

		System.out.println(al);  // Initial list of elements
		
		//---------------------------------------------------- add elements ----------------------------------------------------------------
		
		// add elements in list
		
		al.add("Logi");    
		al.add("Gopi");
		al.add("Surya");
		al.add("Sarath");
		al.add("Partha");
		
		System.out.println(al);
		
		// add elements at specific position 
		
		al.add(2,"Veda");
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Anand");    
		al2.add("Naveen");

		// add another list
		
		al.addAll(al2);    
		System.out.println(al);
		
		ArrayList<String> al3=new ArrayList<String>();
		
		al3.add("Dhana");    
		al3.add("Arun");
		
		// add another list at specific position 
		
		al.addAll(2,al3);
		System.out.println(al);
		
		//--------------------------------------------------- remove elements----------------------------------------------------------------
		
		// remove elements 
		
		al.remove("Dhana");
		System.out.println(al);
		
		// remove elements at specific position
		
		al.remove(2);
		System.out.println(al);
		
		// remove all array list elements
		
		al.removeAll(al2);
		System.out.println(al);
		
		al.removeIf(str -> str.contains("Veda"));
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		
	}

}
