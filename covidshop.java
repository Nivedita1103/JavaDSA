import java.util.*;
public class covidshop {
    static void shopping(int[] arr){
        int time=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=6){
                time=time+7;
                arr[i]=arr[i]-6;
                if(arr[i]==0){
                    list.add(arr[i]);
                    System.out.println(list.toString());
                }else continue;
                
            }
            System.out.println(time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr= new int[n];
	    for(int i =0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
        shopping(arr);
    }
}
//     if(arr[i]<4){
            //         time=2;
            //     }else{
            //         time=7;
            //     }
            // }else{
            //     int x = arr[i]/4;
            //     time= x*2;