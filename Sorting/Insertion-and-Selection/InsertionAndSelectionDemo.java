import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


/**
 * This class is a wrapper for the main() method to demonstrate how to implement some
 * simple insertion and selection sorts.
 *
 * @author schulzcc.
 *         Created Oct 26, 2013.
 */
public class InsertionAndSelectionDemo {

	/**
	 * The main method; creates a list and gives a couple of different methods of
	 * sorting it. Compares time complexity for large lists.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates the sorting instances as interface references. This serves to
		// separate the functionality from its implementation.
		SortAlgorithm insertion = new InsertionSort();
		SortAlgorithm selection = new SelectionSort();
		// Creates a list of integers
		int[] arrayOfInts = {2,5,9,18,7,8,3,1,2,4,0};
		ArrayList<Integer> arrayListToSort = new ArrayList<Integer>();
		for (int i : arrayOfInts) arrayListToSort.add(i);
		System.out.println("Unsorted list: "+arrayListToSort);
		// Use an insertion sort to sort the list
		insertion.sort(arrayListToSort);
		// Output the resulting list
		System.out.println("Insertion sort: "+arrayListToSort);
		// Now copy the original array to a LinkedList
		LinkedList<Integer> linkedListToSort = new LinkedList<Integer>();
		for (int i : arrayOfInts) linkedListToSort.add(i);
		// Use a selection sort to sort the list
		selection.sort(linkedListToSort);
		// Output the result
		System.out.println("Selection sort: "+linkedListToSort);
		// Time comparison -- get a huge list
		ArrayList<Double> giantArrayList = new ArrayList<Double>();
		for (int i=0;i<10000;i++) giantArrayList.add(Math.random());
		// Make more copies
		ArrayList<Double> backupArrayList = new ArrayList<Double>(giantArrayList);
		ArrayList<Double> backupArrayList2 = new ArrayList<Double>(giantArrayList);
		long t;
		t = System.currentTimeMillis();
		insertion.sort(giantArrayList);
		System.out.println("Insertion sort: "+(System.currentTimeMillis()-t)+" ms");
		t = System.currentTimeMillis();
		selection.sort(backupArrayList);
		System.out.println("Selection sort: "+(System.currentTimeMillis()-t)+" ms");
		t = System.currentTimeMillis();
		Collections.sort(backupArrayList2);
		System.out.println("Default (merge) sort: "+
					(System.currentTimeMillis()-t)+" ms");
	}

}
