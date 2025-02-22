package OOP3baitap;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1; // Indicate invalid date
        }
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        year -= (month < 3) ? 1 : 0;
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        if (dayOfWeek == -1) {
            return "Invalid Date";
        }
        return DAYS[dayOfWeek] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        day++;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day > maxDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
        if (day > DAYS_IN_MONTHS[month - 1] && !(month == 2 && isLeapYear(year))) {
            day = DAYS_IN_MONTHS[month - 1];
        } else if (day == 29 && month == 2 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        if (day > DAYS_IN_MONTHS[month - 1] && !(month == 2 && isLeapYear(year))) {
            day = DAYS_IN_MONTHS[month - 1];
        } else if (day == 29 && month == 2 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
}