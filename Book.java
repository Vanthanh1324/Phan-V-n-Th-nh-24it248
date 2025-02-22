package OPP2baitap;
public class Book{
private String name;
private String isbn;
private Author author;
private Author authors[];
private double price;
private int qty=0;
	//HAM CUA BAI 2.2
//public Book(String name,Author author,double price) {
//	this.name=name;
//	this.author=author;
//	this.price=price;
//}
//public Book(String name,Author author,double price,int qty) {
//	this.name=name;
//	this.author=author;
//	this.price=price;
//	this.qty=qty;
//}
public Book(String name,Author authors[],double price) {
	this.name=name;
	this.authors=authors;
	this.price=price;
}
public Book(String name,Author authors[],double price,int qty) {
	this.name=name;
	this.authors=authors;
	this.price=price;
	this.qty=qty;
}
public Book(String isbn,String name, Author author,double price) {
	this.isbn=isbn;
	this.name=name;
	this.author=author;
	this.price=price;
}
public Book(String isbn,String name, Author author,double price,int qty) {
	this.isbn=isbn;
	this.name=name;
	this.author=author;
	this.price=price;
	this.qty=qty;
}
public String getIsbn() {
	return isbn;
}
public String getName() {
	return name;
}
public Author getAuthor() {
	return author;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getAuthor11() {
	return author.getName();
}
public String AuthorName() {
	return AuthorName();
}
public String toString() {
    return "Book[isbn=" + isbn + ", name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
}
public String getAuthorNames() {
	StringBuilder authorNames=new StringBuilder();
	for(int i=0;i<authors.length;i++) {
		authorNames.append(authors[i].getName());
		if(i<authorNames.length()-1){
			authorNames.append(", ");
		}
	}
	return authorNames.toString();
}
 //HAM TOSTRING CUA 2.2
//public String toString() {
//	return "Book[name="+name+","+author.toString()+",price="+price+","+"qyt="+qty+"]";
//}
	// HAM TOSTRING CUA BAI 2.2
//public String toString() {
//	StringBuilder authorsStr =new StringBuilder("{");
//	for(int i=0;i<authors.length;i++) {
//		authorsStr.append(authors[i].toString());
//		if(i<authors.length) {
//			authorsStr.append(", ");
//		}
//	}
//	authorsStr.append("}");
//	return "Book[name=" + name + ", authors=" + authorsStr.toString() + ", price=" + price + ", qty=" + qty + "]";
//}
}
