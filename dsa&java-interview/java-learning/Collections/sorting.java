package Collections;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.age - s.age; // ascending
    }

    public String toString() {
        return age + " " + name;
    }
}

public class sorting {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "A"));
        list.add(new Student(18, "B"));
        list.add(new Student(25, "C"));

        Collections.sort(list);

        System.out.println(list);
    }
}

/*

Student s1 = new Student(18, "A");
Student s2 = new Student(22, "B");

s1.compareTo(s2);

👉 Now:

this.age = 18 (s1)
s.age = 22 (s2)
18 - 22 = -4

👉 Negative → s1 comes before s2

🔸 Important Point ⚠

👉 You don’t control which one is this
👉 Java decides it during sorting (like in Collections.sort())

It keeps comparing pairs like:

obj1 vs obj2
obj2 vs obj3
obj1 vs obj3

*/