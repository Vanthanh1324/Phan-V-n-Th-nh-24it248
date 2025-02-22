package OOP1;

public class Circle {
private double radius;
private String color;

public Circle() {
	radius=1.0;
	color="red";
}
//public Circle(double r) {
//	radius=r;
//	color="red";
//}
public Circle(double r) {
	this.radius=r;
	color="red";
}
public Circle(String c) {
	radius=2.0;
	color=c;
}
public String getColor() {
	return color;
}
public double getRadius() {
	return radius;
}
public double getArea() {
	return radius*radius*Math.PI;
}
public void setRadius(double r) {
	radius= r;
}
public void setColor(String c) {
	color =c;
}
public String toString() {
	//return "Circle[radius="+radius+";"+"color="+color+"]";
	return "Circle[radius="+radius+"]";
}
public double getCircumference() {
	return radius*2*Math.PI;
}
}