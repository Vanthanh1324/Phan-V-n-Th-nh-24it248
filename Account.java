package OPP2baitap;

public class Account {
private int id;
private Customer custromer;
private double balance=0.0;
public Account(int id,Customer customer,double balance) {
	this.id=id;
	this.balance=balance;
	this.custromer=customer;
}
public Account(int id,Customer customer) {
	this.id=id;
	this.custromer=customer;
}
public int getId() {
	return id;
}
public Customer getCustromer() {
	return custromer;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String toString() {
	return custromer.toString() + " balance=$" + String.format("%.2f", balance);
}
public String getCustomerName() {
	return custromer.getName();
}
public Account deposit(double amount) {
	balance+= amount;
	return this;
}
public Account withdraw(double amount) {
	if(balance>=amount) {
		balance-=amount;
	}else {
		System.out.println("amount withdrawn exceeds the current balance!");
	}
	return this;
}
}