abstract class Animal {
    abstract void sound();
}

class Outer {

    int x = 10;
    static int y = 20;

    // 1️⃣ Member Inner Class (Non-static)
    class Inner {
        void display() {
            System.out.println("Member Inner Class: x = " + x);
        }
    }

    // 2️⃣ Static Nested Class
    static class StaticInner {
        void display() {
            System.out.println("Static Nested Class: y = " + y);//cannot access non static variable
        }
    }

    // Method to demonstrate Local & Anonymous classes
    void show() {

        // 3️⃣ Local Inner Class
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class inside method");
            }
        }

        LocalInner li = new LocalInner();
        li.display();

        // 4️⃣ Anonymous Inner Class
        Animal a = new Animal() {
            void sound() {
                System.out.println("Anonymous Inner Class sound");
            }
        };

        a.sound();
    }
}

public class AllInnerClass {
    public static void main(String[] args) {

        Outer o = new Outer();

        // Member Inner Class
        Outer.Inner i = o.new Inner();
        i.display();

        System.out.println("------------");

        // Static Nested Class
        Outer.StaticInner si = new Outer.StaticInner();
        si.display();

        System.out.println("------------");

        // Local + Anonymous Inner Class
        o.show();
    }
}