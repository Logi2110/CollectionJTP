package package4;
import java.util.HashMap;

public class HashMap2 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		System.out.println(hm);
		
		//---------------------------------put-----------------------------------------------------
		System.out.println("////////////////////////////////// put()  /////////////////////////////////"); 
		
		hm.put(100,"Logi");  
		hm.put(101,"Gopi");
		hm.put(102,"Surya"); 
		hm.put(103,"Sarath"); 
		hm.put(104,"Partha"); 
		
		System.out.println(hm);
		
		System.out.println("/////////////////////////////// putIfAbsent()  ///////////////////////////////"); 
		
		hm.putIfAbsent(105,"Logi");  
		System.out.println(hm);
		
		hm.putIfAbsent(105,"Gopi");  
		System.out.println(hm);
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(106,"Dhana");  
		hm1.put(107,"Arun");
		
		System.out.println(hm1);
		
		System.out.println("////////////////////////////////// putAll()  /////////////////////////////////"); 
		
		hm.putAll(hm1);
		System.out.println(hm);
		
		//------------------------------------remove----------------------------------------------------------
		System.out.println("////////////////////////////////// remove()  /////////////////////////////////"); 
		
		hm.remove(107);
		System.out.println(hm);
		
		hm.remove(106,"Dhana");
		System.out.println(hm);
		
		
		//-------------------------------------replace-------------------------------------------------------
		
		hm.replace(105,"Veda");
		System.out.println(hm);
		
		hm.replace(105,"Veda","Santhosh");
		System.out.println(hm);
		
		hm.replaceAll((k,v) -> "Logi");
		System.out.println(hm);
		
		
		
		
		

		
		
	}

}
