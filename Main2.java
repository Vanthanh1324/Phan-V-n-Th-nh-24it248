package OPP2baitap;

public class Main2 {
public static void main(String[] args) {
	//TEST2.2
//	Author a1= new Author("thanh","thanh@gmail.com",'m');
//	Book b1=new Book("java",a1,19.34,1000);
//	System.out.println(b1);
//	b1.setPrice(30);
//	b1.setQty(45);
//	System.out.println(b1.getName());
//	System.out.println(b1.getPrice());
//	System.out.println(b1.getQty());
//	System.out.println(b1.getAuthor());
//	System.out.println(b1.getAuthor().getName());
//	System.out.println(b1.getAuthor().getEmail());
//	Book book=new Book("more Java",new Author("van thanh","vafa@gmail.com",'m'),35.2);
//	System.out.println(book);
	
	//MAIN tEST CUA 2.2
//	Author[] authors = new Author[2];
//	authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
//	authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
//
//	// Declare and allocate a Book instance
//	Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
//	System.out.println(javaDummy);
	Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
//    System.out.println(a1);
//
//    a1.setEmail("ahteck@somewhere.com");
//    System.out.println(a1);
//    System.out.println("name is: " + a1.getName());
//    System.out.println("email is: " + a1.getEmail());

    // Test Book BAI2.3
    Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
    System.out.println(b1);

    b1.setPrice(9.9);
    b1.setQty(99);
    System.out.println(b1);
    System.out.println("isbn is: " + b1.getIsbn());
    System.out.println("name is: " + b1.getName());
    System.out.println("price is: " + b1.getPrice());
    System.out.println("qty is: " + b1.getQty());
    System.out.println("author is: " + b1.getAuthor());  // Author's toString()
    System.out.println("author's name: " + b1.getAuthor11());
    System.out.println("author's name: " + b1.getAuthor().getName());
    System.out.println("author's email: " + b1.getAuthor().getEmail());
 }
}

