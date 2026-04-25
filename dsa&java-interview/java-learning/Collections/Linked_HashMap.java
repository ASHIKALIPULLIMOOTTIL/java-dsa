package Collections;

import java.util.*;

public class Linked_HashMap {
    public static void main(String[] args) {
        
    
    LinkedHashMap<Integer, String> map =
    new LinkedHashMap<>(5, 0.75f, true){ 
        protected boolean removeEldestEntry(Map.Entry e){
            return size() > 5;  //When size exceeds 5 → remove least recently used (eldest) entry
        }
    }; 
           map.put(1, "A");
           map.put(2, "B");
           map.put(3, "C");
           map.put(4, "D");
           map.put(5, "E");
           map.get(1); // access(1 became most recently used)

           map.put(6, "F");
          
           System.out.println(map);
}
}

//(16, 0.75f, true) means initial size 16, resize at 75%, and maintain access order (used for LRU)
