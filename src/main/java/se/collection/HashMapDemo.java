package se.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main (String[] args){
        ex1();
    }

    private static void ex1(){
        HashMap<String ,String> contacts = new HashMap<>();

        // Negar ,  negar1@test.se
        contacts.put("Negar","negar1@test.se");
        contacts.put("Mehrdad","mehrdad@test.se");
        // Negar ,  negar2@test.se
        contacts.put("Negar","negar2@test.se");

        System.out.println(contacts.get("Mehrdad"));
        System.out.println(contacts.get("Negar")); // negar2@test.se

        System.out.println(contacts.containsKey("Negar"));
        System.out.println(contacts.containsValue("negar2@test.se"));

        for (Map.Entry<String, String> entry : contacts.entrySet()){
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }

        // Bonus:
        HashMap<String , Person> people = new HashMap<>();
        Person person1 = new Person(3,"John","Doe", "john@test.se");
        Person person2 = new Person(1, "Alice", "Smith", "alice@test.se");
        Person person3 = new Person(2, "Bob", "Johnson", "bob@test.se");
        people.put(person1.getEmail(), person1);
        people.put(person2.getEmail(), person2);
        people.put(person3.getEmail(), person3);

        System.out.println(people.get("john@test.se"));
        System.out.println(people.get("alice@test.se"));
        System.out.println(people.get("bob@test.se"));

        System.out.println(people.containsKey("bob@test.se"));
        System.out.println(people.containsValue(person3));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
