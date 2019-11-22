package package4;

import java.util.TreeSet;

public class TreeSet2 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Logi");  
		ts.add("Gopi"); 
		ts.add("Surya");
		ts.add("Sarath");
		ts.add("Partha");
		
		System.out.println(ts);
		
		// pollFirst() - retrieve and remove the first element
		
		System.out.println("Lowest value is "+ ts.pollFirst());
		System.out.println(ts);

		// pollLast() - retrieve and remove the first element
		
		System.out.println("Highest value is "+ ts.pollLast());
		System.out.println(ts);
	
		// add elements but we don't specify the index position because it is in sorted automatically
		
		ts.add("Gopi");  
		ts.add("Surya");
		
		System.out.println(ts);
		
		//----------------------------- [Gopi, Logi, Partha, Sarath, Surya] -------------------------------------
		
		System.out.println("------------------------ Sorted Set operation -------------------------------------");
		
		// first element is inclusive and end element is exclusive [Gopi, Logi, Partha, Sarath, Surya]
		
		System.out.println(ts.headSet("Partha"));
		
		System.out.println(ts.tailSet("Partha"));
		
		System.out.println(ts.subSet("Logi","Surya"));
		
		System.out.println("------------------------ Navigable Set operation -------------------------------------");
		
		System.out.println(ts.descendingSet());
		
		System.out.println(ts.headSet("Partha",true));
		
		System.out.println(ts.tailSet("Partha",false));
		
		System.out.println(ts.subSet("Logi",false,"Surya",true));
		
	}

}
