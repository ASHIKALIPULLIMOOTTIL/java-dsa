class Singleton {

    private static Singleton instance;//Static instance (static → shared across program)

    private Singleton() {
        System.out.println("Singleton object created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  //ensures only one object creation
        }
        return instance;
    }
}

public class Single_ton {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s3 == s1); // true (Both variables point to same object)
    }
}
//Only one "Singleton object created" appears because the constructor is called only once, and the same instance is reused for all calls.