package OOP6baitap;
public class Square extends Rectangle {
 public Square() {
	 
 }
 public Square(double side) {
     super(side, side);
 }
 public Square(double side, String color, boolean filled) {
     super(side, side, color, filled);
 }

 public double getSide() {
     return width;
 }

 public void setSide(double side) {
     this.width = this.length = side;
 }
 public void setWidth(double side) {
     this.width = this.length = side;
 }
 public void setLength(double side) {
     this.width = this.length = side;
 }
 public String toString() {
     return "Square[" + super.toString() + "]";
 }
}
