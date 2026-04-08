import com.calc.Basic;
import com.calc.advanced.Advanced;

public class Packages {
    public static void main(String[] args) {

        Basic b = new Basic();
        Advanced a = new Advanced();

        System.out.println("Addition: " + b.add(10, 5));
        System.out.println("Subtraction: " + b.sub(10, 5));

        System.out.println("Square: " + a.square(4));
        System.out.println("Cube: " + a.cube(3));
    }
}