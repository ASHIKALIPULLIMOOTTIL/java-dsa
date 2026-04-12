package Collections;
import java.util.*;

public class Example {
    public static void main(String[] args) {

        Collection<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");
        c1.add("F");

        Collection<String> c2 = new ArrayList<>();
        c2.add("E");
        c2.add("F");
        c2.add("G");
        c2.add("H");

        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);

        // 1️⃣ addAll
        c1.addAll(c2);
        System.out.println("After addAll: " + c1);

        // Reset C1
        c1 = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));

        // 2️⃣ removeAll
        c1.removeAll(c2);
        System.out.println("After removeAll: " + c1);

        // Reset C1
        c1 = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));

        // 3️⃣ retainAll
        c1.retainAll(c2);
        System.out.println("After retainAll: " + c1);

        // 4️⃣ containsAll
        System.out.println("containsAll: " + c1.containsAll(c2));
    }
}

/*

Method	            Meaning
add(E e)	        Add element
remove(Object o)	Remove element
clear()         	Remove all elements
isEmpty()	        Check empty
size()	            Number of elements
iterator()      	Traverse elements

*/