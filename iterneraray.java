import java.util.*;

public class iterneraray {

    public static String getStart(HashMap<String,String> map1){
        HashMap<String, String> map2= new HashMap<>();
        for(String key: map1.keySet()){
            map2.put(map1.get(key), key);
        }
        for(String key: map1.keySet()){
            if(!map2.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("Chennai", "Bangalore");
        map1.put("Mumbai", "Delhi");
        map1.put("Goa", "Chennai");
        map1.put("Delhi", "Goa");

        String start = getStart(map1);

        while(map1.containsKey(start)){
            System.out.print(start+ "->");
            start=map1.get(start);
        }

        System.out.print(start);

    }
}
