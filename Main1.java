package OPP2baitap;

public class Main1 {
	public static void main(String[] args) {
		Author a1= new Author("thanh","thanh@gmail.com",'m');
		System.out.println(a1);
		a1.setEmail("phan@gmail.com");
		System.out.println(a1.getName());
		System.out.println(a1.getGender());
		System.out.println(a1.getEmail());
	}
}
