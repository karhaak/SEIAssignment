package com.sei;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DeDupMain {

	public static Integer[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,
			19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,
			6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	Random random = new Random();
	
	public static void main(String[] args) {
		DeDup deDup = new DeDup();
		
		System.out.println("Printing 'HashSet'");
		deDup.printArray( deDup.deDupWithHashSet(randomIntegers) );
		
		System.out.println("\n\nPrinting 'LinkedHashSet'");
		deDup.printArray( deDup.deDupWithLinkedHashSet(randomIntegers) );
		
		System.out.println("\n\nPrinting 'TreeSet'");
		deDup.printArray( deDup.deDupWithTreeSet(randomIntegers) );
		
		DeDupMain main = new DeDupMain();
		main.performanceTest();
	}


	public void performanceTest() {
		
		long hashDuration = perfHashSet();
		long treeDuration = perfTreeSet();
		long linkHashDurn  = perfLinkedHashSet();
		System.out.println();
		System.out.println("TimeTaken by HashSet \t\t= "+hashDuration);
		System.out.println("TimeTaken by TreeSet \t\t= "+treeDuration);
		System.out.println("TimeTaken by LinkedHashSet\t= "+linkHashDurn);
		
	}
	
	private long perfHashSet() {
		HashSet<Score> hashSet = new HashSet<Score>();

		long start = System.nanoTime();
		for(int i=0;i<1000;i++) {
			int n = random.nextInt(1000-10)+10;
			hashSet.add(new Score(n));
		}
		long end = System.nanoTime();
		
		return (end - start);
	}
	
	private long perfTreeSet() {
		TreeSet<Score> treeSet = new TreeSet<Score>();

		long start = System.nanoTime();		
		for(int i=0;i<1000;i++) {
			int n = random.nextInt(1000-10)+10;
			treeSet.add(new Score(n));
		}
		long end = System.nanoTime();
		
		return (end - start);
	}
	
	private long perfLinkedHashSet() {
		LinkedHashSet<Score> lHashSet = new LinkedHashSet<Score>();
		
		long start = System.nanoTime();
		for(int i=0;i<1000;i++) {
			int n = random.nextInt(1000-10)+10;
			lHashSet.add(new Score(n));
		}
		long end = System.nanoTime();
		
		return (end - start);
	}
}

class Score implements Comparable<Score> {
	private int point;
	
	public Score(int point) {
		this.point = point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	public int compareTo(Score s) {
		if(point > s.getPoint()) return 1;
		else if(point < s.getPoint()) return -1;
		else return 0;
	}
	
	public String toString() {
		return "[Score -> "+ point +" ]";
	}
}
