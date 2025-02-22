package OOP4baitap;

public class Main4 {
	    public static void main(String[] args) {
	        Point point = new Point(2.0f, 3.0f);
	        System.out.println(point);

	        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
	        System.out.println(movablePoint);
	        
	        movablePoint.move();
	        System.out.println(movablePoint);
	    }
	}
