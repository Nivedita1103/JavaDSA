import java.util.LinkedList;
import java.util.Queue;
class queue
{
    public static int min(Queue<Integer> list,
                                     int sortIndex)
    {
    int min_index = 0;
    int min_value = Integer.MAX_VALUE;
    int s = list.size();
    for (int i = 0; i < s; i++)
    {
        int current = list.peek();
        list.poll();
        if (current <= min_value && i <= sortIndex)
        {
            min_index = i;
            min_value = current;
        }
        list.add(current); 
    }
    return min_index;
}

    public static void MininRear(Queue<Integer> list,
                                             int min_index)
     {
        int min_value = 0; 
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
        int current = list.peek();
        list.poll();
        if (i != min_index)
            list.add(current);
        else
            min_value = current;
        }
        list.add(min_value);
    }
      
    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = min(list,list.size() - i);
            MininRear(list, min_index);
        }
    }
  
    public static void main (String[] args) 
    {
        Queue<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(4);
        list.add(5);
        list.add(16);
        list.add(3);
        list.add(1);
        System.out.println(list);
        sortQueue(list);
        
        while(list.isEmpty()== false)
        {
            System.out.print(list.peek() + " ");
            list.poll();
        }
    }
}