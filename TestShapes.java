package OOP6baitap;

public class TestShapes {
    public static void main(String[] args) {
        Shape c1 = new Circle(5.5, "blue", false);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Shape r1 = new Rectangle(2.0, 4.0, "green", true);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Shape s1 = new Square(3.0, "yellow", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        ((Square) s1).setSide(5.0);
        System.out.println("Updated Square: " + s1);
    }
}
