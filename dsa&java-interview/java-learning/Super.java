class Parent {
    Parent() {
        System.out.println("Non-Param of Parent");
    }

    Parent(int x) {
        System.out.println("Param of Parent "+x);
    }
}

class Child extends Parent {
    Child() {
        // implicitly calls super() → Non-Param of Parent
        System.out.println("Non-Param of Child");
    }

    Child(int y) {
        super(y);  // explicitly calls Parent(int x)
        System.out.println("Param of Child "+y);
    }
}

public class Super {
    public static void main(String[] args) {

        Child c1 = new Child();
        System.out.println("----------------");

        Child c2 = new Child(10);
    }
}
