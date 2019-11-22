package package4;
import java.util.ArrayDeque;

public class ArrayDeque1 
{

	public static void main(String[] args) 
	{
		ArrayDeque<String> ad=new ArrayDeque<String>();
		
		ad.add("Logi");  
		ad.add("Gopi"); 
		ad.add("");   
	//	ad.add(null);      // ArrayDeque doen't allow null values
		ad.add("Surya");
		ad.add("Sarath");
		ad.add("");
		ad.add("Gopi"); 
		ad.add("Partha");
		ad.add("Surya");
		ad.add("Gopi"); 
		
		System.out.println(ad);
		
	}

}
