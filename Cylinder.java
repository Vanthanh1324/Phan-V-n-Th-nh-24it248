package OOP5baitap;

public class Cylinder {
	    private Circle base;
	    private double height;
	    public Cylinder() {
	        this.base = new Circle();
	        this.height = 1.0;
	    }
	    public Cylinder(double radius, double height) {
	        this.base = new Circle(radius);
	        this.height = height;
	    }
	    public Cylinder(double radius, double height, String color) {
	        this.base = new Circle(radius, color);
	        this.height = height;
	    }
	    public double getRadius() {
	        return base.getRadius();
	    }
	    public double getHeight() {
	        return height;
	    }
	    public String getColor() {
	        return base.getColor();
	    }
	    public void setRadius(double radius) {
	        base.setRadius(radius);
	    }
	    public void setHeight(double height) {
	        this.height = height;
	    }
	    public void setColor(String color) {
	        base.setColor(color);
	    }
	    public double getVolume() {
	        return base.getArea() * height;
	    }
	    public String toString() {
	        return "Cylinder[base=" + base + ", height=" + height + "]";
	    }
	}