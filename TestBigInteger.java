package OOP3baitap;

import java.math.BigInteger;

public class TestBigInteger {
	public static void main(String[] args) {
        // Create BigInteger objects from the given strings
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Add the two BigIntegers and print the result
        BigInteger sum = i1.add(i2);
        System.out.println("Sum: " + sum);

        // Multiply the two BigIntegers and print the result
        BigInteger product = i1.multiply(i2);
        System.out.println("Product: " + product);
    }
}

