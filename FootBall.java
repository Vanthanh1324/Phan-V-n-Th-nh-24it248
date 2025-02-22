package OOP3baitap;

public class FootBall {
private float x,y,z;
public FootBall(float x,float y,float z) {
	this.x=x;
	this.y=y;
	this.z=z;	
}
public float getX(){
	return x;
}
public float getY() {
	return y;
}
public float getZ() {
	return z;
}
public void setXYZ(float x,float y,float z) {
	this.x=x;
	this.y=y;
	this.z=z;
}
public String toString() {
	return "("+x+","+y+","+z+")";
}
}
