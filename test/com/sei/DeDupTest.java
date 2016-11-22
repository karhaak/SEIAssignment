package com.sei;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeDupTest {

	public static Integer iArr[] = {9,4,5,2,6,4,2,5,3,2};
	
	@Test
	public void testDeDupWithHashSet() {


		System.out.println("UnitTest Case 'HashSet'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.deDupWithHashSet(iArr);
		
		assertTrue("Number of Elements Matched", oArr.length == 6);
	}

	@Test
	public void testDeDupWithLinkedHashSet() {
		Integer[] expected = {9,4,5,2,6,3};
		
		System.out.println("UnitTest Case 'LinkedHashSet'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.deDupWithLinkedHashSet(iArr);
		assertTrue("Elements Order prserved", expected[0]==oArr[0] && expected[1]==oArr[1] && 
			expected[2]==oArr[2] && expected[3]==oArr[3] && expected[4]==oArr[4] && expected[5]==oArr[5]);
	}

	@Test
	public void testDeDupWithTreeSet() {
		Integer[] expected = {2,3,4,5,6,9};
		System.out.println("UnitTest Case 'TreeHashSet'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.deDupWithTreeSet(iArr);
		assertTrue("Set Sorted..", expected[0]==oArr[0] && expected[1]==oArr[1] && 
			expected[2]==oArr[2] && expected[3]==oArr[3] && expected[4]==oArr[4] && expected[5]==oArr[5]);
	}

	@Test
	public void testPrintArray() {
		System.out.println("Printing 'HashSet'");
		DeDup deDup = new DeDup();
		deDup.printArray( deDup.deDupWithHashSet(iArr) );
		
		assertTrue("Printing Array", true);
	}

}
