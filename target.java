import java.util.*;
public class target{
    public static void main(String args[]){
        int[] arr = {2, 7, 5, 13, 15, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i +","+ j);
                } 
            }
           
        }
    }
}

// class Solution {
//   public int[] twoSum(int[] nums, int target) {
//       Map<Integer, Integer> hash= new HashMap<>();
//       for (int i = 0; i < nums.length; ++i) {
//         if (hash.containsKey(target - nums[i]))
//             return new int[] {hash.get(target - nums[i]), i};
//         hash.put(nums[i], i);
//     }
//     throw new IllegalArgumentException();
//   }
// }