import java.util.*;

class longestxor{

// Function to find the length of the longest
// subarray whose bitwise XOR is equal to K
static int LongestLenXORK(int arr[],
						int N, int K)
{
	
	// Stores prefix XOR
	// of the array
	int prefixXOR = 0;

	// Stores length of longest subarray
	// having bitwise XOR equal to K
	int maxLen = 0;

	// Stores index of prefix
	// XOR of the array
	HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
									
	// Insert 0 into the map
	mp.put(0, -1);

	// Traverse the array
	for(int i = 0; i < N; i++)
	{
		
		// Update prefixXOR
		prefixXOR ^= arr[i];

		// If (prefixXOR ^ K) present
		// in the map
		if (mp.containsKey(prefixXOR ^ K))
		{
			
			// Update maxLen
			maxLen = Math.max(maxLen,
			(i - mp.get(prefixXOR ^ K)));
		}
		
		// If prefixXOR not present
		// in the Map
		if (!mp.containsKey(prefixXOR))
		{
			
			// Insert prefixXOR
			// into the map
			mp.put(prefixXOR, i);
		}
	}
	return maxLen;
}

// Driver Code
public static void main(String[] args)
{
	int arr[] = { 1, 2, 4, 7, 2 };
	int N = arr.length;
	int K = 1;
	
	System.out.print(LongestLenXORK(arr, N, K));
}
}

// This code is contributed by Amit Katiyar
