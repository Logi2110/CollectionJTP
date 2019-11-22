package package4;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println(hm);
		
		hm.put(111,"Gopi"); 
		hm.put(100,"Logi");  
		hm.put(101,"Gopi"); 
		hm.put(102,""); 
		hm.put(103,null); 
		hm.put(104,"Surya"); 
		hm.put(105,"Sarath"); 
		hm.put(106,""); 
		hm.put(107,null); 
		hm.put(108,"Gopi"); 
		hm.put(109,"Partha"); 
		hm.put(110,"Surya"); 

		System.out.println(hm);

		for(Entry<Integer,String> entry : hm.entrySet())
		{
		       System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		       
	}

}
