import java.util.Arrays;

/**
 * 
 */

/**
 * @author kellymr1
 *
 */
public class ArrayExample {

	/**
	 * @param args
	 * 
	 *            Notice how the args parameter is also a String array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an Array
		ArrayExample[] demo = new ArrayExample[10]; // will fill 10 spots with
													// null values
		System.out.println(demo[0]);

		// reference the first spot with a 0, last with a 9
		// reference an example
		ArrayExample firstReference = demo[0];

		ArrayExample lastReference = demo[9];
		
		

		// switching spots in an Array
		ArrayExample temp = demo[1]; // assign one of the values to a temporary
										// value
		demo[1] = demo[0]; // switch the two spots
		demo[0] = temp; // assign the original position to the temporary value
		
		
		
		int[] test1 = {5,2,3,6,0}; 

		// sorting (several examples on Github
		System.out.println("before: ");
		for (int i = 0; i < test1.length; i++) {
			System.out.print(test1[i]); // Prints out the specific spot, i, in
										// the array as it goes through the for
										// loop
		}

		Arrays.sort(test1); // Sorts the int array test1
		System.out.println();
		System.out.println("after: ");
		for (int i = 0; i < test1.length; i++) {
			System.out.print(test1[i]); // Prints out the specific spot, i, in
										// the array as it goes through the for
										// loop
		}
	}

}
