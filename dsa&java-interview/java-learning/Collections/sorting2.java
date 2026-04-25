package Collections;

import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class sorting2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "A"));
        list.add(new Student(18, "C"));
        list.add(new Student(25, "B"));

        Collections.sort(list, new NameComparator());

        System.out.println(list);
    }
}

/*

👉 It compares two strings (name) lexicographically (alphabetically)

s1.name → first object
s2.name → second object
🔸 How compareTo() works
Returns:
0  → if equal
<0 → if s1 < s2
>0 → if s1 > s2

*/