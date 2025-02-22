package OOP6baitap;
abstract class Animal {
 protected String name;

 public Animal(String name) {
     this.name = name;
 }

 public abstract void greets();
}
class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }
 public void greets() {
     System.out.println("Meow");
 }
}
class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }
 public void greets() {
     System.out.println("Woof");
 }

 public void greets(Dog anotherDog) {
     System.out.println("Woooof");
 }
}
class BigDog extends Dog {
 public BigDog(String name) {
     super(name);
 }
 public void greets() {
     System.out.println("Wooow");
 }

 public void greets(Dog anotherDog) {
     System.out.println("Wooooow");
 }

 public void greets(BigDog anotherBigDog) {
     System.out.println("Wooooooooow");
 }
}
