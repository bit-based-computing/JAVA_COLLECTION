package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementations {
    public static void main(String[] args) {

        // It is an implementation of set interface
        // It has all method of list interface
        // but it does not contain duplicate value
        // it does not have any ordering
        Set<String> hashSet = new HashSet<>();

        // It is another implementation of set interface
        // it is like as HashSer
        // But it follow the order of adding item
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // It is an another implementation of set interface
        // it implements sortedSet interface
        // It contain all element in sorted order
        // It can contain those object which object implement Comparable interface
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);

        Set<Person> treeSetPerson = new TreeSet<>();
        treeSetPerson.add(new Person("C"));
        treeSetPerson.add(new Person("D"));
        treeSetPerson.add(new Person("A"));

        System.out.println(treeSetPerson);
    }
}

