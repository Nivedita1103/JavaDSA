// import java.util.Arrays;

// class freqsort {

//     public static void countFreq(int arr[], int n) {
//         boolean visited[] = new boolean[n];

//         Arrays.fill(visited, false);
//         for (int i = 0; i < n; i++) {
//             if (visited[i] == true)
//                 continue;
//             int count = 1;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     visited[j] = true;
//                     count++;
//                 }
//             }
//             System.out.println(arr[i] + " " + count);
//             int[] ca= new int[n];
//             ca[i]=count;
//             System.out.println(Arrays.toString(ca));
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[] { 1,2,2,2,3,3,3,3,4,5};
//         int n = arr.length;
//         countFreq(arr, n);
//     }
// }

import java.util.*;

public class freqsort {
    private static void sortByFrequency(int[] inputArray) {
        Map<Integer, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (count.containsKey(inputArray[i])) {

                count.put(inputArray[i], count.get(inputArray[i]) + 1);
            } else {
                count.put(inputArray[i], 1);
            }
        }

        ArrayList<Integer> sortedElements = new ArrayList<>();
        count.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for (int i = 1; i <= entry.getValue(); i++)
                        sortedElements.add(entry.getKey());
                });
        System.out.println(sortedElements);
    }

    public static void main(String[] args) {
        sortByFrequency(new int[] { 1, 2, 2, 2, 3, 3, 3, 3, 4, 5 });
    }
}