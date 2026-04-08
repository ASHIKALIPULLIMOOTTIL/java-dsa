class Demo {

    int x;
    String name;

    // 1️⃣ this() → calling another constructor
    Demo() {
        this(100, "Default");  // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Demo(int x, String name) {
        // 2️⃣ this → referring instance variables
        this.x = x;
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    // 3️⃣ this → passing current object
    void display() {
        show(this);
    }

    void show(Demo obj) {
        System.out.println("Inside show()");
        System.out.println("x = " + obj.x + ", name = " + obj.name);
    }

    // 4️⃣ this → returning current object
    Demo getObject() {
        return this;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Demo d = new Demo();   // triggers constructor chaining

        System.out.println("----------------");

        d.display();           // passing current object

        System.out.println("----------------");

        Demo d2 = d.getObject();  // returning current object
        System.out.println("Returned Object values:");
        System.out.println("x = " + d2.x + ", name = " + d2.name);
    }
}//ThisKeyword