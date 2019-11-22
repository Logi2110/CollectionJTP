package package4;
import java.util.TreeMap;

public class TreeMap2 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		System.out.println(tm);
		
		tm.put(102,"Surya"); 
		tm.put(103,"Sarath"); 
		tm.put(104,"Partha"); 
		tm.put(100,"Logi");  
		tm.put(101,"Gopi"); 

		System.out.println(tm);
		
		System.out.println("------------------------------- sortedMap -----------------------------------------------");
		
		System.out.println(tm.descendingMap());
		
		System.out.println(tm.headMap(102));
		
		System.out.println(tm.tailMap(102));
		
		System.out.println(tm.subMap(101,103));
		
		
		
		System.out.println("------------------------------- NavigableMap -----------------------------------------------");
		
		System.out.println(tm.descendingMap());
		
		System.out.println(tm.headMap(102,true));
		
		System.out.println(tm.tailMap(102,false));
		
		System.out.println(tm.subMap(101,false,103,true));
		
		
		
		
		
		
		
	}

}
