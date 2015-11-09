import java.security.SecureRandom;
import java.util.Random;

public class RandomExample {

	// this will show off all the random objects out there.
	// which one is best?
	// why do you think they take up so much time?
	// which one do you think is most efficient?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startA = System.currentTimeMillis();
		Random a = new Random();
		System.out.println(a.nextInt(10));
		long endA = System.currentTimeMillis();
		System.out.println("Random object time: " + (endA - startA));

		long startB = System.currentTimeMillis();
		int b = (int) (10 * Math.random());
		System.out.println(b);
		long endB = System.currentTimeMillis();
		System.out.println("Math.random time: " + (endB - startB));

		long startC = System.currentTimeMillis();
		SecureRandom c = new SecureRandom();
		System.out.println(c.nextInt(10));
		long endC = System.currentTimeMillis();
		System.out.println("SecureRandom: " + (endC - startC));

	}

}
