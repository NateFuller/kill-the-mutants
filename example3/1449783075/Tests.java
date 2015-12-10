package example3;

/*
 * Special thanks to
 * http://users.csc.calpoly.edu/~djanzen/tdl/tddintro/helloworld/
 * for getting us started.
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Tests
{

	private Snippet h;

	@Before
	public void setUp() throws Exception
	{
		h = new Snippet();
	}

    int[] arr2 = {1, 2, 3, 4};
	    int[] arr3 = { -5, -10, 5, 8, 99};
		int[] arr4 = {2,4,5,3,1,7,9,10};
    
	@Test
	public void testEmpty() {
	    int[] arr0 = {};
		assertTrue(isSorted(h.doInsertionSort(arr0)));
	}
	
	@Test
	public void testOne() {
	    int[] arr1 = {1};
	    assertTrue(isSorted(h.doInsertionSort(arr1)));
	}
	
	@Test
	public void testMore() {
	    int[] arr2 = {1, 2, 3, 4};
	    int[] arr3 = { -5, -10, 5, 8, 99};
		int[] arr4 = {2,4,5,3,1,7,9,10};
		assertTrue(isSorted(h.doInsertionSort(arr2)));
		assertTrue(isSorted(h.doInsertionSort(arr3)));
		assertTrue(isSorted(h.doInsertionSort(arr4)));
	}
	
	@Test
	public void testSame() {
	    int[] arr5 = {1, 1, 1, 1};
	    assertTrue(isSorted(h.doInsertionSort(arr5)));
	}
	
	// assuming ascending order
	private boolean isSorted(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] > arr[i + 1])
	            return false;
	    }
	    return true;
	}

}
