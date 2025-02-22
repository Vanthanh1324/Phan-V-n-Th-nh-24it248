package OOP5baitap;

public class LineSubTest {
	    public static void main(String[] args) {
	        LineSub l1 = new LineSub(1, 1, 4, 5);
	        System.out.println(l1);
	        System.out.println("Length: " + l1.getLength());
	        System.out.println("Gradient: " + l1.getGradient());

	        Point p1 = new Point(2, 3);
	        Point p2 = new Point(5, 7);
	        LineSub l2 = new LineSub(p1, p2);
	        System.out.println(l2);
	        System.out.println("Length: " + l2.getLength());
	        System.out.println("Gradient: " + l2.getGradient());
	    }
	}