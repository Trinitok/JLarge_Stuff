import java.util.Collections;
import java.util.List;


/**
 * The SelectionSort class has a method that takes a list as input and modifies the list
 * in place, returning void. The method should operate on any type of list. It is the 
 * student's job to implement this.
 *
 * @author TODO 2a: Max Kelly
 *         Created Oct 29, 2013.
 */
public class SelectionSort implements SortAlgorithm {

	/**
	 * Sorts a list using selection sort in place, modifying the order of the list
	 * itself and returning void.
	 * @param <T>
	 *
	 * @param listToSort
	 */
	@Override
	public <T extends Comparable<T>> void sort(List<T> listToSort) {
		/*
		 * TODO 2b: Implement the selection sort algorithm. Make sure to modify the list
		 * in place; that means you can't create a new list and add elements to it, as
		 * the original list will not be correctly modified.
		 */
		
		for(int i = 0; i < listToSort.size() - 1; i ++){
			int smallestIndex = i;
			T smallestElement = listToSort.get(i);
			for(int j = i+1; j < listToSort.size(); j++){
				if(listToSort.get(j).compareTo(smallestElement) < 0){
					smallestIndex = j;
					smallestElement = listToSort.get(j);
				}
			}
			
			Collections.swap(listToSort, i, smallestIndex);
		}
	}

}
