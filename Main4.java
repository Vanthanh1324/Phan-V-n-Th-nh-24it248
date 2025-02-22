package OPP2baitap;

public class Main4 {
public static void main(String[] args) {
	Customer customer1 = new Customer(1001, "John Doe", 'm');
    Customer customer2 = new Customer(1002, "Jane Smith", 'f');

    Account account1 = new Account(1, customer1, 100.0);
    Account account2 = new Account(2, customer2);

    System.out.println("Account 1: " + account1);
    System.out.println("Account 2: " + account2);

    account1.deposit(50.0);
    System.out.println("Account 1 after deposit: " + account1);

    account2.deposit(200.0);
    account2.withdraw(100.0);
    System.out.println("Account 2 after deposit and withdraw: " + account2);

    account1.withdraw(200.0); // Should print "amount withdrawn exceeds the current balance!"
    System.out.println("Account 1 after invalid withdraw: " + account1);

    System.out.println("Customer name of Account 2: " + account2.getCustomerName());

    account2.setBalance(500.0);
    System.out.println("Account 2 after setBalance: " + account2);

}
}
