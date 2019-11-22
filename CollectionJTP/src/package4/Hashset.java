package package4;
import java.util.ArrayList;
import java.util.HashSet;

public class Hashset 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Logi");    
		hs.add("Gopi");
		hs.add("");        // this is empty string
		hs.add(null);      // allow only one null value
		hs.add("Surya");
		hs.add("Sarath");
		hs.add("");        // remove duplicate elements
		hs.add(null);      // remove null value because it is duplicate
		hs.add("Gopi");    // remove duplicate elements
		hs.add("Partha");
		hs.add("Surya");   // remove duplicate elements
		hs.add("Gopi");    // remove duplicate elements
		
		for(String s:hs)
		{
			System.out.println(s); 
		}
		
		System.out.println("///////// add another collection elements ////////////"); 
		
		// add another collection elements
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("aaaa");    
		al.add("bbbb");
		al.add("cccc");
		
		hs.addAll(al);
		
		for(String s:hs)
		{
			System.out.println(s); 
		}
		
		System.out.println("///////// add another collection elements ////////////"); 
		
		// add another collection elements
		
		HashSet<String> hs2=new HashSet<String>(al);
		
		hs2.add("dddd");
		
		for(String s:hs2)
		{
			System.out.println(s); 
		}
	}

}
