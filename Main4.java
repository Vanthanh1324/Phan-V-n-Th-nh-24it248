package OOP3baitap;

public class Main4 {
public static void main(String[] args) {
	MyDate date1 = new MyDate(2023, 10, 26);
    System.out.println("Date 1: " + date1);

    System.out.println("Next day: " + date1.nextDay());
    System.out.println("Next month: " + date1.nextMonth());
    System.out.println("Next year: " + date1.nextYear());

    System.out.println("Previous day: " + date1.previousDay());
    System.out.println("Previous month: " + date1.previousMonth());
    System.out.println("Previous year: " + date1.previousYear());

    MyDate date2 = new MyDate(2024, 2, 28);
    System.out.println("Date 2: " + date2);
    System.out.println("Next day (leap year): " + date2.nextDay());
    System.out.println("Next month (leap year): " + date2.nextMonth());

    MyDate date3 = new MyDate(2023, 12, 31);
    System.out.println("Date 3: " + date3);
    System.out.println("Next day (year change): " + date3.nextDay());
    System.out.println("Next month (year change): " + date3.nextMonth());

    MyDate date4 = new MyDate(2023, 1, 1);
    System.out.println("Date 4: " + date4);
    System.out.println("Previous day (year change): " + date4.previousDay());
    System.out.println("Previous month (year change): " + date4.previousMonth());
    System.out.println("Previous year: " + date4.previousYear());

    MyDate date5 = new MyDate(2023, 3, 31);
    System.out.println("Date 5: " + date5);
    System.out.println("Previous month (day change): " + date5.previousMonth());

    MyDate date6 = new MyDate(2024, 3, 31);
    System.out.println("Date 6: " + date6);
    System.out.println("Previous month (leap year day change): " + date6.previousMonth());

    MyDate date7 = new MyDate(2023, 1, 31);
    System.out.println("Date 7: " + date7);
    System.out.println("Next month (day change): " + date7.nextMonth());

    MyDate date8 = new MyDate(2024, 1, 31);
    System.out.println("Date 8: " + date8);
    System.out.println("Next month (leap year day change): " + date8.nextMonth());

    // Test invalid dates
    try {
        new MyDate(2023, 13, 1);
    } catch (IllegalArgumentException e) {
        System.out.println("Exception: " + e.getMessage());
    }

    try {
        new MyDate(2023, 2, 29);
    } catch (IllegalArgumentException e) {
        System.out.println("Exception: " + e.getMessage());
    }

    try {
        date1.setDate(2023, 1, 32);
    } catch (IllegalArgumentException e) {
        System.out.println("Exception: " + e.getMessage());
    }
}
}
