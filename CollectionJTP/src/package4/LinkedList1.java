package package4;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 
{

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Logi");    
		ll.add("Gopi");
		ll.add("Surya");
		ll.add("Sarath");
		ll.add("Partha");
		
		System.out.println(ll);
		
		ll.addFirst("Google");   // list.addFirst
		System.out.println(ll);
		
		ll.addLast("Facebook");  // list.addLast
		System.out.println(ll);
		
		ll.removeFirst();        // list.removeFirst()
		System.out.println(ll);
		
		ll.removeLast();         // list.removeLast()
		System.out.println(ll);
		  
		ll.add(3,"Gopi");
		ll.add(0,"Sarath");
		System.out.println(ll);
		
		ll.removeFirstOccurrence("Gopi");  // list.removeFirstOccurrence()
		System.out.println(ll);
		
		ll.removeLastOccurrence("Sarath"); // list.removeLastOccurrence()
		System.out.println(ll);
		
		// Reverse a list 
		
		Iterator<String> itr=ll.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
		}
	}

}
