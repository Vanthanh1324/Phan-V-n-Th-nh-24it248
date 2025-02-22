package OPP2baitap;

public class Main8 {
	 public static void main(String[] args) {
	        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 3, 4);
	        MyTriangle t2 = new MyTriangle(new MyPoint(1, 1), new MyPoint(4, 1), new MyPoint(2, 5));
	        MyTriangle t3 = new MyTriangle(0, 0, 2, 2, 4, 0);

	        System.out.println(t1);
	        System.out.println(t2);
	        System.out.println(t3);

	        System.out.println("Chu vi của t1: " + t1.getPerimeter());
	        System.out.println("Chu vi của t2: " + t2.getPerimeter());
	        System.out.println("Chu vi của t3: " + t3.getPerimeter());

	        System.out.println("Loại của t1: " + t1.getType());
	        System.out.println("Loại của t2: " + t2.getType());
	        System.out.println("Loại của t3: " + t3.getType());
	    }
	}

