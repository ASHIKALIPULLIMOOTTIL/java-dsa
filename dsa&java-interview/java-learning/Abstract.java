abstract class Animal {

    // 1️⃣ Abstract method (must be implemented by child)
    abstract void sound();

    // 2️⃣ Concrete method (normal method)
    void eat() {
        System.out.println("Animal eats food");
    }

    // 3️⃣ Constructor in abstract class
    Animal() {
        System.out.println("Animal constructor called");
    }

    // 4️⃣ Static method in abstract class
    static void info() {
        System.out.println("This is Animal class");
    }
}

// Concrete class (must implement abstract method)
class Dog extends Animal {

    // 5️⃣ Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    Dog(){
        System.out.println("dog constructor called");
    }
    // Extra method
    void display() {
        System.out.println("Dog class method");
    }
}

public class Abstract {
    public static void main(String[] args) {

        // ❌ Animal a = new Animal();  // Not allowed (cannot instantiate abstract class)

        // 6️⃣ Abstract reference → Concrete object (Dynamic Method Dispatch)
        Animal a = new Dog();

        a.sound();   // calls Dog's method
        a.eat();     // calls Animal's method

        System.out.println("------------");

        // 7️⃣ Calling static method
        Animal.info();

        System.out.println("------------");

        // 8️⃣ Downcasting to access child-specific method
        Dog d = new Dog();
        d.display();
    }
}