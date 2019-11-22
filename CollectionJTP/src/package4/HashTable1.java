package package4;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable1 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		System.out.println(ht);
		
		ht.put(111,"Gopi"); 
		ht.put(100,"Logi");  
		ht.put(101,"Gopi"); 
		ht.put(102,""); 
	//	ht.put(103,null);           Hashtable can't allow null values 
		ht.put(104,"Surya"); 
		ht.put(105,"Sarath"); 
		ht.put(106,""); 
	//	ht.put(107,null); 
		ht.put(108,"Gopi"); 
		ht.put(109,"Partha"); 
		ht.put(110,"Surya");
		
		System.out.println(ht);
		
		for(Entry<Integer, String> entry : ht.entrySet())
		{
		       System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}

}
