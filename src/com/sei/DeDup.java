package com.sei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

	
	/**
	 * De-Duplicates with 'HashSet'.
	 * @param numArray
	 * @return Integer[]
	 */
	public Integer[] deDupWithHashSet(Integer[] numArray) {
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(numArray));
		return (Integer[]) set.toArray(new Integer[set.size()]);
	}
	
	/**
	 * De-Duplicates with 'HashSet'.
	 * @param numArray
	 * @return Integer[]
	 */
	public Integer[] deDupWithLinkedHashSet(Integer[] numArray) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(Arrays.asList(numArray));
		return (Integer[]) set.toArray(new Integer[set.size()]);
	}
	
	/**
	 * De-Duplicates with 'HashSet'.
	 * @param numArray
	 * @return Integer[]
	 */
	public Integer[] deDupWithTreeSet(Integer[] numArray) {
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(Arrays.asList(numArray));
		return (Integer[]) set.toArray(new Integer[set.size()]);
	}
	
	/**
	 * De-Duplicates with 'HashSet'.
	 * @param numArray
	 * @return Integer[]
	 */
	public void printArray(Integer[] arr) {
		for (int i=0;i<arr.length; i++) {
		   System.out.print(arr[i] + " ");
		}
	}
}
