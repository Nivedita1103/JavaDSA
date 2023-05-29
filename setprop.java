import java.util.*;

public class setprop {
    public static void main(String[] args) {

        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
        System.out.println(intersect(arr1, arr2));
        System.out.println(res);
    }

    //union of arrays

    public static int union(int[] arr1, int[] arr2){

        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();

    }

    //intersection of arrays



    public static int intersect(int[] arr1, int[] arr2){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        int c=0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                c++;
                res.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        return c;

    }

}
