import java.util.List;


/**
 * TODO Put here a description of what this class does.
 *
 * @author schulzcc.
 *         Created Oct 28, 2013.
 */
public interface SortAlgorithm {
	
	/**
	 * Sorts a list using an algorithm determined by implementation and modifies the
	 * original list.
	 *
	 * @param listToSort
	 */
	public <T extends Comparable<T>> void sort(List<T> listToSort);

}
