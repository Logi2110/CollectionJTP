package package4;

import java.util.LinkedHashSet;

public class LinkedHashSet1 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("Logi");    
		lhs.add("Gopi");
		lhs.add("");        // this is empty string
		lhs.add(null);      // allow only one null value
		lhs.add("Surya");
		lhs.add("Sarath");
		lhs.add("");        // remove duplicate elements
		lhs.add(null);      // remove null value because it is duplicate
		lhs.add("Gopi");    // remove duplicate elements
		lhs.add("Partha");
		lhs.add("Surya");   // remove duplicate elements
		lhs.add("Gopi");    // remove duplicate elements
		
		for(String s:lhs)
		{
			System.out.println(s); 
		}
		
	}

}
