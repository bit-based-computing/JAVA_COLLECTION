package set;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }

    public String toString(){
        return name;
    }
}
