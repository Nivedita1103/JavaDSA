import java.util.*;
class first_last_occurance {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int arr[] = new int [N];
        for (int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        int first = -1;
        int last=-1;
        for(int j=0;j<N;j++){
            if(arr[j]==x){
                if(first==-1){
                    first= j;
                }last = j;
            }
        }
        System.out.println("first:"+first);
        System.out.println("last:"+ last);
        }
    }  