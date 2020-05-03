package map;

import set.Person;

import java.util.*;

public class MapImplementations {
    public static void main(String[] args) {
        // It an implementation of map
        // It does not follow any order
        Map<String, String> hashMap = new HashMap<>();

        // To put a key value
        hashMap.put("item1", "Apple");
        hashMap.put("item2", "Mango");

        // To get a key value
        // If not found return null
        String item = hashMap.get("item1");

        // To remove a key value
        hashMap.remove("item1");

        // To check a key is exist or not in map
        boolean isContainsKey = hashMap.containsKey("item1");

        // To check a value is exist or not in map
        boolean isContainsValue = hashMap.containsValue("Apple");

        // TO get the map size
        int size = hashMap.size();

        // To get all keys
        Set<String> keys = hashMap.keySet();

        // TO get all values
        Collection<String> values = hashMap.values();

        // It is another implementation of Map
        // It follow item insert ordering
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        // It is another implementation of Map
        // It is synchronized that means it thead safe
        Map<String, String> hashTable = new Hashtable<>();

        // It is another implementation of Map
        // It sorted the item by key
        // key object class must be implement Comparable interface

        Map<Person, Person> treeMap = new TreeMap<>();
        treeMap.put(new Person("c"), new Person("Foysal"));
        treeMap.put(new Person("b"), new Person("Rahim"));
        treeMap.put(new Person("a"), new Person("Korim"));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

    }
}
