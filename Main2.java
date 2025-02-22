package OOP4baitap;

public class Main2 {
	    public static void main(String[] args) {
	        Person person = new Person("Alice", "123 Main St");
	        System.out.println(person);

	        Student student = new Student("Bob", "456 College Rd", "Computer Science", 2, 5000.0);
	        System.out.println(student);

	        Staff staff = new Staff("Charlie", "789 School St", "XYZ High School", 45000.0);
	        System.out.println(staff);
	    }
	}
