package OOP3baitap;

public class Main3 {
public static void main(String[] args) {
	MyTime time1 = new MyTime(12, 30, 45);
    System.out.println("Time 1: " + time1);

    time1.nextSecond();
    System.out.println("Time 1 after nextSecond(): " + time1);

    time1.nextMinute();
    System.out.println("Time 1 after nextMinute(): " + time1);

    time1.nextHour();
    System.out.println("Time 1 after nextHour(): " + time1);

    time1.previousSecond();
    System.out.println("Time 1 after previousSecond(): " + time1);

    time1.previousMinute();
    System.out.println("Time 1 after previousMinute(): " + time1);

    time1.previousHour();
    System.out.println("Time 1 after previousHour(): " + time1);

    MyTime time2 = new MyTime(23, 59, 59);
    System.out.println("Time 2: " + time2);
    time2.nextSecond();
    System.out.println("Time 2 after nextSecond(): " + time2);
}
}
