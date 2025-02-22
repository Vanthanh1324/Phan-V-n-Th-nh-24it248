package OOP6baitap;

public class Main {
	 public static void main(String[] args) {
	     Animal cat = new Cat("Kitty");
	     cat.greets();

	     Dog dog = new Dog("Buddy");
	     dog.greets();

	     BigDog bigDog = new BigDog("Max");
	     bigDog.greets();

	     dog.greets(new Dog("Charlie"));
	     bigDog.greets(new Dog("Rocky"));
	     bigDog.greets(new BigDog("Bruno"));
	 }
}
