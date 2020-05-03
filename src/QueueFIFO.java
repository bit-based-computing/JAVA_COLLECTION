import set.Person;

import java.util.*;

public class QueueFIFO {
    public static void main(String[] args) {

        // It is an implementation of queue
        Queue<String> queue = new LinkedList<>();

        // To add an element
        // If fail to add then throw an IllegalStatementException otherwise return true
        queue.add("item1");

        // TO add an element
        // If fail then return false otherwise return true
        queue.offer("item2");

        // To get head element
        // If not found then throw NoSuchElementException
        String headElement = queue.element();

        // To get head element
        // If not found it return a null value
        String headElement1 = queue.peek();

        // To get head element and remove
        // If not found then throw NoSuchElementException
        String headElementGetAndRemove = queue.remove();

        // To get head element and remove
        // If not found then it return null
        String headElementGetAndRemove1 = queue.poll();

        // It is another implementation of queue
        // We can set queue priority by this
        // queue item object must be implement Comparable interface
        Queue<Person> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Person("a"));
        priorityQueue.offer(new Person("c"));
        priorityQueue.offer(new Person("b"));
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

    }
}
