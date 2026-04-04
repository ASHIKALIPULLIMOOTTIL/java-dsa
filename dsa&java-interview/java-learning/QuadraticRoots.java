import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two real and distinct roots:");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        } 
        else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root:");
            System.out.println("Root = " + root);
        } 
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root1 = " + real + " + " + imaginary + "i");
            System.out.println("Root2 = " + real + " - " + imaginary + "i");
        }

        sc.close();
    }
}