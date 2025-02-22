package OOP4baitap;

public class Dog extends Mammal {
	    public Dog(String name) {
	        super(name);
	    }
	    public void greets() {
	        System.out.println("gaugau");
	    }
	    public void greets(Dog another) {
	        System.out.println("gaugau");
	    }
	    public String toString() {
	        return "Dog[" + super.toString() + "]";
	    }
	}
