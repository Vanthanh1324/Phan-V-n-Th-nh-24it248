package OOP4baitap;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("MeowMeo");
    }
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
