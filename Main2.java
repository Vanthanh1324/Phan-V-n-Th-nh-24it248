package OOP7baitap;

public class Main2 {
	    public static void main(String[] args) {
	        PolyLine polyline = new PolyLine();
	        polyline.appendPoint(1, 1);
	        polyline.appendPoint(4, 5);
	        polyline.appendPoint(new Point(7, 8));

	        System.out.println("Polyline: " + polyline);
	        System.out.println("Total Length: " + polyline.getLength());
	    }
}
