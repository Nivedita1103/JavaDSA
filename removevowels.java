import java.util.Arrays;
import java.util.List;

class removevowels
{	
	static String remVowel(String str)
	{
		return str.replaceAll("[aeiouAEIOU]", "");
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";		
		System.out.println(remVowel(str));
	}
}
