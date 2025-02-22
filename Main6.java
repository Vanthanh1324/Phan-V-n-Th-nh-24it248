package OOP4baitap;

public class Main6 {
	public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Mammal1");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Rocky");

        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2); 
    }
}
