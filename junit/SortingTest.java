import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {

	Sorting st = null;
	
	@Before
	public void setUp() throws Exception {
		st = new Sorting();
	}

	@Test
	public void testInsertionSort() {
		int a[] = {4,3,6,28,4,78,2,5,60,2,56,5};
		st.insertionSort(a);
		
	}

	@Test
	public void testIsSorted() {
		int a[] = {4,3,6,28,4,78,2,5,60,2,56,5};
		assertEquals(false,st.isSorted(a));
	}
	@Test
	public void testIsSorted1() {
		int a[] = {1,2,3,4,6};
		assertEquals(true,st.isSorted(a));
	}

	@Test
	public void testQuicksort() {
		int a[] = {4,3,6,28,4,78,2,5,60,2,56,5};
		st.quicksort(a);
	}
	@Test
	public void testQuicksort1() {
		int a[] = {9,8,7,6,5,4,3,2,1};
		st.quicksort(a);
	}
	@Test
	public void testQuicksort2() {
		int a[] = {1,2,3,4,5,6,7,8,0};
		st.quicksort(a);
	}

	@Test
	public void testSwapReferences() {
		String[]  a = {"ssf","fbbb","fgd","ddv"};
	    st.swapReferences(a, 1, 3);
	}



}
