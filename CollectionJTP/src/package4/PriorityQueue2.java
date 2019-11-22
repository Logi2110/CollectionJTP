package package4;
import java.util.PriorityQueue;

public class PriorityQueue2 
{

	public static void main(String[] args)
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Logi");  
		pq.add("Gopi"); 
		pq.add("Surya");
		pq.add("Sarath");
		pq.add("Partha");
		
		System.out.println(pq);
		
		pq.offer("Dhana");
		pq.offer("Arun");
		System.out.println(pq);
		
		System.out.println("----------------- element, peek && remove , poll-------------------------------------");
		
		System.out.println(pq.element());  // retrieve 
		System.out.println(pq.peek());     // retrieve 
		System.out.println(pq);
		
		System.out.println(pq.remove());   // retrieve and remove 
		System.out.println(pq);           
		
		System.out.println(pq.poll());     // retrieve and remove 
		System.out.println(pq);
		
		pq.clear();
		System.out.println(pq);
		
	//	System.out.println(pq.element());  // only retrieve 
		System.out.println(pq.peek());     // retrieve && return null if pq is empty
		
    //	System.out.println(pq.remove());   // only retrieve and remove     
		
		System.out.println(pq.poll());     // retrieve and remove  && return null if pq is empty
	
	}

}
