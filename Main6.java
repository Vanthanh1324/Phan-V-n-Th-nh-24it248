package OPP2baitap;

public class Main6 {
    public static void main(String[] args) {
	        MyPoint p1 = new MyPoint(1, 2);
	        MyPoint p2 = new MyPoint(4, 6);

	        MyLine line1 = new MyLine(p1, p2);
	        MyLine line2 = new MyLine(0, 0, 3, 4);

	        System.out.println(line1);
	        System.out.println(line2);

	        System.out.println("Begin X của line1: " + line1.getBeginX());
	        System.out.println("End Y của line1: " + line1.getEndY());

	        line1.setBeginXY(2, 3);
	        System.out.println("Sau khi đổi begin của line1: " + line1);

	        System.out.println("Chiều dài line1: " + line1.getLength());
	        System.out.println("Độ dốc line1 (radian): " + line1.getGradient());
	    }
	}


