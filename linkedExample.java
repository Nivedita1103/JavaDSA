import java.util.Iterator;
import java.util.LinkedList;

public class linkedExample {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<String>();
        car.add("Fortuner");
        car.add("Farrari");
        car.add("Audi");
        car.add("BMW");
        System.out.println(car);
        Iterator i = car.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
