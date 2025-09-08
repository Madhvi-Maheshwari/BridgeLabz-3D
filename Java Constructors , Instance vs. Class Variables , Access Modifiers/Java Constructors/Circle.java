package JavaConstructors;

public class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        System.out.println("Default radius: " + c1.radius);
        System.out.println("User radius: " + c2.radius);
    }
}
