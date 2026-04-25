package Collections;

import java.util.*;

public class treemap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>(Map.of(4,"aa",5,"bb"));

        map.put(3, "C");
        map.put(0, "A");
        map.put(2, "B");

        System.out.println(map);

        Map.Entry<Integer, String> et = map.firstEntry();  //entrySet()	returns Set of all entries
                                                           //firstEntry() returns single first entry

        System.out.println("First Entry: " + et.getKey() + " " + et.getValue());
    }
}