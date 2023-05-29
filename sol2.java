import java.util.*;

public class sol2 {
	
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 30, 2));
		list.add(Arrays.asList(31, 60, 4));
		list.add(Arrays.asList(61, 120, 3));
		list.add(Arrays.asList(1, 20, 2));
		list.add(Arrays.asList(21, 40, 4));
		list.add(Arrays.asList(41, 60, 5));
		list.add(Arrays.asList(61, 120, 3));
		list.add(Arrays.asList(1, 60, 4));
		list.add(Arrays.asList(61, 120, 4));
		int ret = maxBandwith(list);
		System.out.println(ret);
	}
	
	public static class Item {
		int t;
		int b;
		int p; // 1 if plus, 0 if minus.
		
		public Item(int t, int b, int p) {
			this.t = t;
			this.b = b;
			this.p = p;
		}
	}
    public static int maxBandwith(List<List<Integer>> list) {
    	int ret = 0;
    	int curr = 0;
    	PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> (a.t == b.t ? a.p - b.p : a.t - b.t));
    	for(List<Integer> l : list) {
    		if (l.get(2) == 0)
    			continue;
    		pq.offer(new Item(l.get(0), l.get(2), 1));
    		pq.offer(new Item(l.get(1), l.get(2), 0));
    	}
    	
    	while(!pq.isEmpty()) {
    		Item item = pq.poll();
    		if (item.p == 1) {
    			curr += item.b;
    			ret = Math.max(ret,  curr);
    		} else {
    			curr -= item.b;
    		}
    	}
    	
    	return ret;
    }

}