package package4;
import java.util.*;

public class ArrayList1
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>(); // creating array list 

		System.out.println(al);     // empty array list
		
		al.add("logi");     // adding object in array list
		al.add("gopi");
		al.add("surya");
		al.add("sarath");
		al.add("partha");
		
		System.out.println(al);   // invoking array list object 
		
	// ways to iterate the elements
		
		// 1. Iterator interface 
		
		System.out.println("/////////////////////// Iterator interface ///////////////////////"); 
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
		}
		
		
		// 2. ListIterator interface 

		System.out.println("///////////////////// ListIterator interface ////////////////////"); 
		
		ListIterator<String> itr1=al.listIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next()); 
		}


		System.out.println("///////////////////////// for loop //////////////////////////////"); 
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)); 
		}
		
		System.out.println("///////////////////// for-each loop ////////////////////////////"); 
		
		for(String s:al)
		{
			System.out.println(s); 
		}
		

		System.out.println("///////////////////// forEach() method ///////////////////////////"); 
		
		al.forEach(s1->{
			System.out.println(s1); 
		});
		

		System.out.println("////////////////// forEachRemaining() method /////////////////////"); 
		
		Iterator<String> itr2=al.iterator();
		
		itr2.forEachRemaining(s2->{
			System.out.println(s2); 
		});
		
		
	}

}
