package OOP3baitap;

public class Player {
private int number;
private float x,y,z=0.0f;
public Player(int number,float x, float y) {
	this.number=number;
	this.x=x;
	this.y=y;
}
public void move(float xDisp,float yDisp) {
	this.x+=xDisp;
	this.y+=yDisp;
}
public void jump(float zDisp) {
	this.z+=zDisp;
}
public boolean near(FootBall ball) {
	float distance =(float)Math.sqrt(Math.pow(ball.getX()-x,2)+ Math.pow(ball.getY()-y, 2));
	return distance<8;
}
public void kick(FootBall ball) {
	if(near(ball)) {
		ball.setXYZ(ball.getX()+10,ball.getY()+5,ball.getZ()+2);
		System.out.println("Player "+ number+"Kicked the ball");
	}else {
		System.out.println("Player "+number+" is too far to kick the ball.");
	}
}
public String toString() {
	return "Player "+ number +" at(" + x + "," + y + "," + z + ")";
}
}
