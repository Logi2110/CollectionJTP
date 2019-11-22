package package4;

import java.util.ArrayList;

public class ArrayList4
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		// list.isEmpty()

		if(al.isEmpty())
			System.out.println("ArrayList is empty");
		
		al.add("Logi");    
		al.add("Gopi");
		al.add("Surya");
		al.add("Sarath");
		al.add("Partha");
		
		System.out.println(al);
		
		System.out.println("Is ArrayList empty = "+al.isEmpty());
		
		// list.get() and list.set()
		
		System.out.println(al.get(2));
		
		al.set(2,"Veda");                // replace surya by veda 
		
		System.out.println(al.get(2));
		
		System.out.println(al);
		
		// list.retainAll()
		
		ArrayList<String> al2=new ArrayList<String>();
	    
		al2.add("Partha");  
		al2.add("Surya");    
		al2.add("Gopi");
		  
		al.retainAll(al2);
		System.out.println(al);
		
	}

}
