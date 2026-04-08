class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder();
        
        c.radius = 7;
        c.height = 10;

        System.out.println("Radius: " + c.radius);
        System.out.println("Height: " + c.height);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Perimeter of Circle: " + c.perimeter());
        System.out.println("Circumference of Circle: " + c.circumference());
        System.out.println("Volume of Cylinder: " + c.volume());
    }
}