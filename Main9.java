package OPP2baitap;

public class Main9 {
	 public static void main(String[] args) {
	        MyPoint topLeft = new MyPoint(1, 4);
	        MyPoint bottomRight = new MyPoint(5, 1);
	        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

	        System.out.println("Rectangle: " + rectangle);
	        System.out.println("Width: " + rectangle.getWidth());
	        System.out.println("Height: " + rectangle.getHeight());
	        System.out.println("Area: " + rectangle.getArea());
	        System.out.println("Perimeter: " + rectangle.getPerimeter());
	    }
	}

