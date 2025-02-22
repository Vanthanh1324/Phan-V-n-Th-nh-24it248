package OOP1;

public class testCircle {
	public static void main(String[] args) {
//		Circle c= new Circle();
//		System.out.println("Circle has radius is: "+ c.getRadius()+" and Area is: "+c.getArea());
//		Circle c1=new Circle(2.0);
//		System.out.println("Circle has radius is: "+ c1.getRadius()+" and Area is: "+c1.getArea());
//		Circle c2=new Circle("blue");
//		System.out.println("Circle has area is: "+c2.getArea()+" and Color is: "+c2.getColor());
//		Circle c3=new Circle();
//		c3.setRadius(4.4);
//		System.out.println(c3.getRadius());
//		c3.setColor("blue");
//		System.out.println(c3.getColor());
//		Circle c4=new Circle(5.5);
//		System.out.println(c4.toString());
//		Circle c5=new Circle(7.5);
//		System.out.println(c5);
		//System.out.println("Operator '+' invokes toString() too: " + c5);
		Circle c=new Circle(1.1);
		System.out.println(c);
		Circle c1=new Circle();
		System.out.println(c1);
		c.setRadius(2.2);
		System.out.println(c);
		System.out.println("radius is: "+ c.getRadius());
		System.out.printf("area=%.5f%n",c.getArea());
		System.out.printf("circumference=%.3f%n",c.getCircumference());
		}
}