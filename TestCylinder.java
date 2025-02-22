package OOP5baitap;

public class TestCylinder {
	    public static void main(String[] args) {
	        // Default cylinder
	        Cylinder c1 = new Cylinder();
	        System.out.println(c1);
	        System.out.println("Volume: " + c1.getVolume());

	        // Cylinder with specific radius and height
	        Cylinder c2 = new Cylinder(2.5, 5.0);
	        System.out.println(c2);
	        System.out.println("Volume: " + c2.getVolume());

	        // Cylinder with specific radius, height, and color
	        Cylinder c3 = new Cylinder(3.0, 7.0, "blue");
	        System.out.println(c3);
	        System.out.println("Volume: " + c3.getVolume());

	        // Modify attributes
	        c3.setRadius(4.0);
	        c3.setHeight(10.0);
	        c3.setColor("green");
	        System.out.println("Updated " + c3);
	        System.out.println("Updated Volume: " + c3.getVolume());
	    }
	}
