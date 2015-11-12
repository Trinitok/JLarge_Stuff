import java.util.Collections;
import java.util.List;


/**
 * The InsertionSort class has a method that takes a list as input and modifies the list
 * in place, implementing an insertion sort. The class is to be implemented by each 
 * student as part of the demo.
 *
 * @author TODO 1a: Max Kelly
 *         Created Oct 29, 2013.
 */
public class InsertionSort implements SortAlgorithm {

	/**
	 * Creates a list with a sorted copy of the data in the given list.
	 * @param <T>
	 *
	 * @param listToSort
	 */
	@Override
	public <T extends Comparable<T>> void sort(List<T> listToSort) {
		/* 
		 * TODO 1b: Implement the insertion sort algorithm. The type T takes the place 
		 * of Integer, Double, etc., as we don't know what we are sorting. Rather than 
		 * returning a separate list, the algorithm should work on the list passed and
		 * modify it to be sorted.
		 */
		
		for(int i = 1; i <listToSort.size(); i++){
			int index = i;
			while(index > 0 && listToSort.get(index).compareTo(listToSort.get(index - 1)) < 0){
				Collections.swap(listToSort,index,index - 1);
				index --;
			}
		}
	}

}
