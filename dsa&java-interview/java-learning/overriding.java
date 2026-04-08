class Animal {
     void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
       void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal a = new Dog();  // parent referencing to child object
        a.sound();             // called based on the object(child)
        Dog d=new Dog();
        d.sound();
    }
}