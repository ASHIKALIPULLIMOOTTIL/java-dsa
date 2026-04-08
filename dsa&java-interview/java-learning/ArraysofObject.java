
    class Student {
    int roll;
    String name;

    Student(int r, String n) {   //constructor
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}

public class ArraysofObject {
    public static void main(String[] args) {

        // Array of objects
        Student[] s = new Student[3];  //This only creates space for references, not actual objects

        // Creating objects
         s[0] = new Student(1, "Ashik");
         s[1] = new Student(2, "Rahul");
         s[2] = new Student(3, "Anu");

                                                     /*Student[] s = {
                                                               new Student(1, "Ashik"),
                                                               new Student(2, "Rahul"),
                                                               new Student(3, "Anu")
                                                                    }; */
       
        // Accessing objects
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}

