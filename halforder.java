import java.util.*;
public class halforder {
    public static void main(String[] args) {
        Integer[] arr = { 1,7,9,8,5,4 };
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,n/2,n, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}