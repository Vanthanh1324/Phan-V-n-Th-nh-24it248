package OOP3baitap;

public class Main6 {
public static void main(String[] args) {
	 FootBall ball = new FootBall(50, 50, 0);
     Player player1 = new Player(7, 48, 49);
     Player player2 = new Player(10, 30, 30);

     System.out.println(ball);
     System.out.println(player1);
     System.out.println(player2);

     player1.move(2, 1);
     System.out.println("After moving: " + player1);

     player1.jump(2);
     System.out.println("After jumping: " + player1);

     player1.kick(ball);
     System.out.println("After kick: " + ball);

     player2.kick(ball);
 }
}
