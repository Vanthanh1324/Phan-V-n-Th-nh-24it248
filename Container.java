package OOP3baitap;

public class Container {
private int x1,x2,y1,y2;
public Container(int x,int y,int width,int height) {
	this.x1=x;
	this.y1=y;
	this.x2=x+width;
	this.y2=y+height;
}
public int getX() {
	return x1;
}
public int getY() {
	return y1;
}
public int getWidth() {
	return x2-x1;
}
public int getHeight() {
	return y2-y1;
}
public boolean collides(Ball ball) {
	float ballx=ball.getX();
	float bally=ball.getY();
	int radius=ball.getRadius();
	return !(ballx - radius < x1 || ballx + radius > x2 || bally - radius < y1 || bally + radius > y2);

}
public String toString() {
	return "Container[("+x1+","+y1+");("+x2+","+y2+")]";
}
}
