package Collections;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {

        // 🔸 1. LIST (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("List (for-each):");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("List (Iterator):");
        Iterator<String> listIt = list.iterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        // 🔸 2. SET (HashSet)
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("\nSet (for-each):");
        for (int x : set) {
            System.out.println(x);
        }
        System.out.println("set (Iterator):");
        Iterator<Integer> it = set.iterator();

         while (it.hasNext()) {
             System.out.println(it.next());
           }
        // 🔸 3. QUEUE (LinkedList)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("\nQueue (for-each):");
        for (int x : queue) {
            System.out.println(x);
        }

        // 🔸 4. STACK
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        System.out.println("\nStack (for-each):");
        for (int x : stack) {
            System.out.println(x);
        }

        // 🔸 5. MAP (HashMap)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("\nMap (entrySet):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nMap (keySet):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("\nMap (values):");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // 🔸 6. Java 8 forEach
        System.out.println("\nList (forEach lambda):");
        list.forEach(x -> System.out.println(x));
        System.out.println("\nmap (forEach lambda):");
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}