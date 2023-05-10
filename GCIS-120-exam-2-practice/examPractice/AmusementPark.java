package examPractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AmusementPark {

    public static void enter(Person person) {
        System.out.println(person + " enters the park");
    }

    public static void getInLine(Person person, Queue<Person> line) {
        line.add(person);
        System.out.println(person + " gets in line for the ride.");
    }

    public static void ride(Person person) {
        if (person.canRide()) {
            System.out.println(person + " rides the ride. Woooh so much fun!");
        } else {
            System.out.println("Oh no! " + person + " could not ride the ride.");
        }
    } 

    public static void main(String[] args) {
        System.out.println("----- Welcome to the amusement park!! We have one ride... -----");

        Set<Person> people = new HashSet<>();

        Adult adult1 = new Adult("James", 60);
        Adult adult2 = new Adult("Marcy", 49);
        Adult adult3 = new Adult("Luke", 54);

        Child child1 = new Child("Sarah", 34);
        Child child2 = new Child("Dan", 37);
        Child child3 = new Child("Peter", 32);

        child1.assignChaperone(adult1);
        child2.assignChaperone(adult2);
        child3.assignChaperone(adult3);

        people.add(adult1);
        people.add(adult2);
        people.add(adult3);

        people.add(child1);
        people.add(child2);
        people.add(child3);

        Queue<Person> line = new LinkedList<>();

        for(Person person : people) {
            getInLine(person, line);
        }

        while(line.peek() != null) {
            ride(line.poll());
        }

        System.out.println("----- Thanks for stopping by. -----");
        

    }
}
