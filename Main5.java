package OOP3baitap;

public class Main5 {
public static void main(String[] args) {
	Ball b1=new Ball(50,50,5,10,45);
	Container c1=new Container(0, 0, 100, 100);
	System.out.println(b1);
	System.out.println(c1);
	for(int i= 0;i<5;i++) {
		b1.move();
		if(!c1.collides(b1));
		b1.reflectHozizontal();
		b1.reflectVertical();
	}
	System.out.println(b1);
}
}
