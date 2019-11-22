package package4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Logi");  
		ts.add("Gopi");
		ts.add("");        // this is empty string
	//	ts.add(null);      // TreeSet doesn't allow null values
		ts.add("Surya");
		ts.add("Sarath");
		ts.add("");        // remove duplicate elements
		ts.add("Gopi");    // remove duplicate elements
		ts.add("Partha");
		ts.add("Surya");   // remove duplicate elements
		ts.add("Gopi");    // remove duplicate elements
		
		System.out.println(ts);
		
		// Reverse a list (Descending order)
		
		Iterator<String> itr=ts.descendingIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next()); 
		
		
	}

}
