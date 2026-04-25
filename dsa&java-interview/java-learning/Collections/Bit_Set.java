package Collections;

import java.util.*;

public class Bit_Set {
    public static void main(String[] args) {

        BitSet bs = new BitSet();

        bs.set(1);
        bs.set(3);
        bs.set(5);

        System.out.println(bs);           // {1, 3, 5} it prints the indexes where bits are set to true (1), NOT the full binary sequence.
        System.out.println(bs.get(3));    // true

        bs.flip(3);
        System.out.println(bs);           // {1, 5}

        System.out.println(bs.cardinality()); // 2
    }
}

/*

🔹 Basic Idea
Index:   0 1 2 3 4
Bits :   1 0 1 0 1

👉 Each position stores true (1) or false (0)

*/