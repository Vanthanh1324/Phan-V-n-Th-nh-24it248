package OPP2baitap;

public class Main7 {
	 public static void main(String[] args) {
	        MyCircle c1 = new MyCircle();
	        MyCircle c2 = new MyCircle(3, 4, 5);
	        MyCircle c3 = new MyCircle(new MyPoint(6, 8), 10);

	        System.out.println(c1);
	        System.out.println(c2);
	        System.out.println(c3);

	        System.out.println("Bán kính của c2: " + c2.getRadius());
	        c2.setRadius(7);
	        System.out.println("Sau khi đổi bán kính c2: " + c2);

	        System.out.println("Tọa độ tâm của c3: (" + c3.getCenterX() + ", " + c3.getCenterY() + ")");
	        c3.setCenterXY(10, 12);
	        System.out.println("Sau khi đổi tâm của c3: " + c3);

	        System.out.println("Diện tích của c2: " + c2.getArea());
	        System.out.println("Chu vi của c2: " + c2.getCircumference());

	        System.out.println("Khoảng cách giữa c2 và c3: " + c2.distance(c3));
	    }
	}
