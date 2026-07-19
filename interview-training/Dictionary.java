import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        map.put("Banana", 10);
        map.put("Apple", 5);
        map.put("Orange", 8);

        

        System.out.println(map);
    }
}

//If you want to sort by values alphabetically
/*
import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Aapple");

        List<Map.Entry<Integer, String>> list =
                new ArrayList<>(map.entrySet()); //A list that stores multiple map entries.

        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
*/

/*
Method	Purpose
put()	Add or update a key-value pair
get()	Get value by key
getOrDefault()	Return value or default if key absent
containsKey()	Check if a key exists
containsValue()	Check if a value exists
remove()	Remove an entry
replace()	Replace a value
putIfAbsent()	Add only if key is absent
size()	Number of entries
isEmpty()	Check if map is empty
clear()	Remove all entries
keySet()	Get all keys
values()	Get all values
entrySet()	Get all key-value pairs
forEach()	Iterate over entries
putAll()	Copy entries from another map
clone()	Create a shallow copy
equals()	Compare two maps
hashCode()	Get the hash code of the map
*/