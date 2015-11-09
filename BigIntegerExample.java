
import java.math.BigInteger;

import javax.swing.ImageIcon;


public class BigIntegerExample {

	// can be used for images, most commonly used for bitwise logic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger a = new BigInteger("5");
		System.out.println("BigInteger addition: " + a.add(new BigInteger("6")));
		
		System.out.println("BigInteger bitwise AND: " + a.and(new BigInteger("129")));
		
		System.out.println("BigInteger bitwise OR ex1: " + a.or(new BigInteger("10")));
		
		System.out.println("BigInteger bitwise OR ex2: " + a.or(new BigInteger("1")));
		
		System.out.println("BigInteger XOR: " + a.xor(new BigInteger("7")));
	}

}
