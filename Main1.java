package OOP4baitap;

public class Main1 {
	public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.0, 10.0, "green");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
