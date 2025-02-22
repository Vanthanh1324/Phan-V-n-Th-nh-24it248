package OOP6baitap2;

public class Main3 {
	 public static void main(String[] args) {
	        Circle circle = new Circle(10);
	        System.out.println(circle);
	        System.out.println("Perimeter: " + circle.getPerimeter());
	        System.out.println("Area: " + circle.getArea());

	        ResizableCircle resizableCircle = new ResizableCircle(10);
	        System.out.println(resizableCircle);
	        resizableCircle.resize(50); // Reduce size by 50%
	        System.out.println("After resize: " + resizableCircle);
	        System.out.println("New Perimeter: " + resizableCircle.getPerimeter());
	        System.out.println("New Area: " + resizableCircle.getArea());
	    }
	}