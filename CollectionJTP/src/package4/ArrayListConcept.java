package package4;
import java.util.ArrayList;

public class ArrayListConcept 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Logi");    
		al.add("Gopi");
		al.add("");
		al.add("Surya");
		al.add("Sarath");
		al.add("Partha");
		al.add("Logi"); 
		al.add("Logi"); 
		al.add("");
		al.add("");
		al.add("Gopi");
		
		System.out.println(al);  
		
		al.sort(null);
		
		System.out.println(al);  
	}

}
