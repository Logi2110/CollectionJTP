package package4;
import java.util.Hashtable;

public class Hashtable2 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		System.out.println(ht);
		
		ht.put(102,"Surya"); 
		ht.put(103,"Sarath"); 
		ht.put(104,"Partha"); 
		ht.put(100,"Logi");  
		ht.put(101,"Gopi"); 
		
		System.out.println(ht);
		
		System.out.println("------------------------------- getOrDefault() -----------------------------------------------");
		
		System.out.println(ht.getOrDefault(101,"Not found")); // if it is not found, Not found string is consider as value
		System.out.println(ht.getOrDefault(106,"Not found"));
		
		System.out.println("------------------------------- putIfAbsent() -----------------------------------------------");
		
		ht.putIfAbsent(105, "Veda");
		System.out.println(ht);
		
		ht.putIfAbsent(102, "Sandy");
		System.out.println(ht);
		
	}

}
