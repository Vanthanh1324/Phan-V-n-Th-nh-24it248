package OOP3baitap;

public class Main1 {
public static void main(String[] args) {
	 MyComplex c1 = new MyComplex(1.0, 2.0);
     System.out.println("c1: " + c1); // Expected: (1.0+2.0i)

     MyComplex c2 = new MyComplex();
     System.out.println("c2: " + c2); // Expected: (0.0+0.0i)

     // Test Getters and Setters
     c2.setReal(3.0);
     c2.setImag(4.0);
     System.out.println("c2: " + c2); // Expected: (3.0+4.0i)
     System.out.println("c2 real: " + c2.getReal()); // Expected: 3.0
     System.out.println("c2 imag: " + c2.getImag()); // Expected: 4.0

     c2.setValue(5.0, 6.0);
     System.out.println("c2: " + c2); // Expected: (5.0+6.0i)

     // Test isReal() and isImaginary()
     MyComplex c3 = new MyComplex(7.0, 0.0);
     System.out.println("c3 isReal: " + c3.isReal()); // Expected: true
     System.out.println("c3 isImaginary: " + c3.isImaginary()); // Expected: false

     MyComplex c4 = new MyComplex(0.0, 8.0);
     System.out.println("c4 isReal: " + c4.isReal()); // Expected: false
     System.out.println("c4 isImaginary: " + c4.isImaginary()); // Expected: true

     MyComplex c5 = new MyComplex(0.0, 0.0);
     System.out.println("c5 isReal: " + c5.isReal()); // Expected: true
     System.out.println("c5 isImaginary: " + c5.isImaginary()); // Expected: true

     // Test equals()
     MyComplex c6 = new MyComplex(1.0, 2.0);
     System.out.println("c1 equals c6: " + c1.equals(c6)); // Expected: true
     System.out.println("c1 equals (1.0, 2.0): " + c1.equals(1.0)); // Expected: true
     System.out.println("c1 equals c2: " + c1.equals(c2)); // Expected: false

     // Test magnitude()
     System.out.println("c1 magnitude: " + c1.magnitude()); // Expected: ~2.236
     System.out.println("c4 magnitude: " + c4.magnitude()); // Expected: 8.0

     // Test argument()
     System.out.println("c1 argument: " + c1.argument()); // Expected: ~1.107 (radians)
     System.out.println("c4 argument: " + c4.argument()); // Expected: ~1.571 (radians)

     // Test add() and addNew()
     MyComplex c7 = new MyComplex(1.0, 2.0);
     MyComplex c8 = new MyComplex(3.0, 4.0);
     System.out.println("c7: " + c7); // Expected: (1.0+2.0i)
     System.out.println("c8: " + c8); // Expected: (3.0+4.0i)
     c7.addNew(c8);
     System.out.println("c7 add c8: " + c7); // Expected: (4.0+6.0i)

     MyComplex c9 = new MyComplex(1.0, 2.0);
     MyComplex c10 = new MyComplex(3.0, 4.0);
     MyComplex c11 = c9.addNew(c10);
     System.out.println("c9: " + c9); // Expected: (1.0+2.0i)
     System.out.println("c10: " + c10); // Expected: (3.0+4.0i)
     System.out.println("c11 (c9 addNew c10): " + c11); // Expected: (4.0+6.0i)

     // Test subtract() and subtractNew()
     MyComplex c12 = new MyComplex(5.0, 6.0);
     MyComplex c13 = new MyComplex(2.0, 1.0);
     c12.subtract(c13);
     System.out.println("c12 subtract c13: " + c12); // Expected: (3.0+5.0i)

     MyComplex c14 = new MyComplex(5.0, 6.0);
     MyComplex c15 = new MyComplex(2.0, 1.0);
     MyComplex c16 = c14.subtractNew(c15);
     System.out.println("c14: " + c14); // Expected: (5.0+6.0i)
     System.out.println("c16 (c14 subtractNew c15): " + c16); // Expected: (3.0+5.0i)

     // Test multiply()
     MyComplex c17 = new MyComplex(2.0, 3.0);
     MyComplex c18 = new MyComplex(4.0, 5.0);
     c17.multiply(c18);
     System.out.println("c17 multiply c18: " + c17); // Expected: (-7.0+22.0i)

     // Test divide()
     MyComplex c19 = new MyComplex(10.0, 5.0);
     MyComplex c20 = new MyComplex(2.0, 1.0);
     c19.divide(c20);
     System.out.println("c19 divide c20: " + c19); // Expected: (4.0+3.0i)

     // Test conjugate()
     MyComplex c21 = new MyComplex(1.0, 2.0);
     MyComplex c22 = c21.conjugate();
     System.out.println("c21 conjugate: " + c22); // Expected: (1.0-2.0i)
 }
}