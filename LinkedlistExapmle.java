import java.util.LinkedList;

public class LinkedlistExapmle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);        // add at end
        list.add(20);
        System.out.println(list);
        list.addFirst(5);    // add at beginning
        list.addLast(30);    // add at end
        System.out.println(list);
        list.remove();       // removes first element
        System.out.println(list);
        list.removeLast();   // removes last element
        list.remove(Integer.valueOf(20)); // remove specific element

        System.out.println(list);
    }
}

