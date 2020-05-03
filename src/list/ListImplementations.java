package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListImplementations {

    public static void main(String[] args) {

        // ArrayList an implementation of List interface
        List<String> arrayList = new ArrayList<>();

        // To add an item in list
        arrayList.add("Foysal");

        // To add an item in index
        arrayList.add(1, "Ahmmed");

        // To get an item from list by index
        String value = arrayList.get(0);

        // To remove an item from list by index
        arrayList.remove(0);

        // To set and item in an index
        arrayList.set(0, "Test Set");

        // To get an item index
        int index = arrayList.indexOf("Ahmmmed");

        // To get an item last index
        int lastIndex = arrayList.lastIndexOf("Ahmmed");

        // To get list size
        int size = arrayList.size();

        // Vector is another implementation of List interface
        // It is Thead safe. it is synchronized
        List<Integer> vectorList = new Vector<>();

        // LinkedList is another implementation of List interface
        // It is an double linked list data structure
        List<String> LinkedListImp = new LinkedList<>();

    }
}
