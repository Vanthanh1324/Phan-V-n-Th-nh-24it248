package OPP2baitap;

public class Main5 {
	 public static void main(String[] args) {
	        MyPoint p1 = new MyPoint();
	        MyPoint p2 = new MyPoint(3, 4);
	        MyPoint p3 = new MyPoint(6, 8);

	        System.out.println("p1: " + p1);
	        System.out.println("p2: " + p2);
	        System.out.println("p3: " + p3);

	        System.out.println("Khoảng cách từ p2 đến gốc tọa độ: " + p2.distance());
	        System.out.println("Khoảng cách từ p2 đến (1,1): " + p2.distance(1, 1));
	        System.out.println("Khoảng cách từ p2 đến p3: " + p2.distance(p3));

	        int[] xy = p2.getXY();
	        System.out.println("Tọa độ p2: (" + xy[0] + ", " + xy[1] + ")");
	    }
}
