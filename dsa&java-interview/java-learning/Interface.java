// 1️⃣ Interface with constant and abstract method
interface Animal {
    int MAX_AGE = 20;   // public static final (constant)

    void sound();       // public abstract (by default)

    // 2️⃣ Default method
    default void eat() {
        System.out.println("Animal eats food");
    }

    // 3️⃣ Static method
    static void info() {
        System.out.println("This is Animal interface");
    }
}

// 4️⃣ Another interface (for multiple inheritance)
interface Pet {
    void play();
}

// 5️⃣ Class implementing multiple interfaces
class Dog implements Animal, Pet {

    // 6️⃣ Implement abstract method
    public void sound() {
        System.out.println("Dog barks");
    }

    // Implement second interface method
    public void play() {
        System.out.println("Dog plays");
    }

    // 7️⃣ Overriding default method
   // public void eat() {
  //      System.out.println("Dog eats bones");
  //  }

    // Extra method
    void display() {
        System.out.println("Dog class method");
    }
}

public class Interface {
    public static void main(String[] args) {

        // ❌ Cannot create object of interface
        // Animal a = new Animal();

        // 8️⃣ Interface reference → object (runtime polymorphism)
        Animal a = new Dog();

        a.sound();   // implemented method
        a.eat();     // overridden default method

        System.out.println("------------");

        // 9️⃣ Calling static method
        Animal.info();

        System.out.println("------------");

        // 🔟 Using second interface reference
        Pet p = new Dog();
        p.play();

        System.out.println("------------");

        // 1️⃣1️⃣ Downcasting to access class-specific method
        Dog d = (Dog) a;
        d.display();

        System.out.println("------------");

        // 1️⃣2️⃣ Accessing constant
        System.out.println("Max Age: " + Animal.MAX_AGE);
    }
}