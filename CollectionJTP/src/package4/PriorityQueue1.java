package package4;
import java.util.PriorityQueue;

public class PriorityQueue1 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Logi");  
		pq.add("Gopi"); 
		pq.add("");   
	//	pq.add(null);      // PriorityQueue doesn't allow null values
		pq.add("Surya");
		pq.add("Sarath");
		pq.add("");
		pq.add("Gopi"); 
		pq.add("Partha");
		pq.add("Surya");
		pq.add("Gopi"); 
		
		System.out.println(pq);
		
	}

}
