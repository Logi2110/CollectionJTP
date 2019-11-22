package package4;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMap1
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		System.out.println(lhm);
		
		lhm.put(111,"Gopi"); 
		lhm.put(100,"Logi");  
		lhm.put(101,"Gopi"); 
		lhm.put(102,""); 
		lhm.put(103,null); 
		lhm.put(104,"Surya"); 
		lhm.put(105,"Sarath"); 
		lhm.put(106,""); 
		lhm.put(107,null); 
		lhm.put(108,"Gopi"); 
		lhm.put(109,"Partha"); 
		lhm.put(110,"Surya"); 
		
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());
		
		for(Entry<Integer, String> entry : lhm.entrySet())
		{
		       System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}

}
