package OOP6baitap;
public class Main2 {
	 public static void main(String[] args) {
	        MovablePoint point = new MovablePoint(2, 3, 1, 1);
	        System.out.println(point);
	        point.moveUp();
	        System.out.println(point);
	        point.moveRight();
	        System.out.println(point);

	        MovableRectangle rectangle = new MovableRectangle(0, 10, 10, 0, 2, 2);
	        System.out.println(rectangle);
	        rectangle.moveUp();
	        System.out.println(rectangle);
	        rectangle.moveRight();
	        System.out.println(rectangle);
	        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
	        System.out.println(circle);
	        circle.moveUp();
	        circle.moveLeft();
	        System.out.println(circle);
	    }
}
