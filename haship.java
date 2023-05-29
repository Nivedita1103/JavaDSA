import java.util.*;

class haship {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        //no of entries
        int n= in.nextInt();

        for (int i = 0; i < n; i++) {
            Integer a = in.nextInt(); //key
            String b = in.next(); //value

            hmap.put(a, b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}