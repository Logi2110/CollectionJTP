package package4;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap1 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		System.out.println(tm);
		
		tm.put(111,"Gopi"); 
		tm.put(100,"Logi");  
		tm.put(101,"Gopi"); 
		tm.put(102,""); 
		tm.put(103,null); 
		tm.put(104,"Surya"); 
		tm.put(105,"Sarath"); 
		tm.put(106,""); 
		tm.put(107,null); 
		tm.put(108,"Gopi"); 
		tm.put(109,"Partha"); 
		tm.put(110,"Surya");
		
		System.out.println(tm);
		
		for(Entry<Integer, String> entry : tm.entrySet())
		{
		       System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		
	}

}
