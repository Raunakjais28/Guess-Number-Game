import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // get element at index 
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // add element in the middle
        list.add(1, 25);
        System.out.println("After adding element at index 1: " + list);

        // set element 
        list.set(2, 35);
        System.out.println("After setting element at index 2: " + list);


        // delete element at index
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // loop through the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}
