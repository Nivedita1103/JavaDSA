import java.util.*;
public class frequency {  
    public static void main(String[] args) {  
        int[] arr = { 1,2,2};
    int n = arr.length;
        // int [] arr = new int [n] ;  
  
        int [] fr = new int [n];  
        int visited = -1;  
        for(int i = 0; i < n; i++){  
            int count = 1;  
            for(int j = i+1; j < n; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
    
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  

            
            
        }  
  
        System.out.println(Arrays.toString(fr));
        int max = Arrays.stream(fr).max().getAsInt();
        int ans = 1-(max/n);
        System.out.println(ans);
    }}  