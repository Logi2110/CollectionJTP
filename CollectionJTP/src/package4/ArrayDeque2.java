package package4;
import java.util.ArrayDeque;

public class ArrayDeque2 
{

	public static void main(String[] args) 
	{
		ArrayDeque<String> ad=new ArrayDeque<String>();
		
		ad.add("Logi");  
		ad.add("Gopi");
		ad.add("Surya");
		ad.add("Sarath");
		ad.add("Partha");
		
		System.out.println(ad);
		
		ad.offer("Dhana");        // same as offerLast()
		System.out.println(ad);
		
		ad.offerFirst("Arun");
		System.out.println(ad);
		
		ad.poll();               // same as pollFirst()
		System.out.println(ad);
		
		ad.pollLast();
		System.out.println(ad);
	}

}
