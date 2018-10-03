package org.kp.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 4, 11, 1 };
		System.out.println("Premitive Arrays before sorting");
		for (int a1 : arr) {
			System.out.println(a1);
		}
		Arrays.sort(arr);
		System.out.println("Arrays after sorting");
		for (int a1 : arr) {
			System.out.println(a1);
		}
		String[] s = { "Banaras", "Hindu", "University" };
		int a = Array.getLength(s);
		System.out.println("Length of the array string is :" + a);
		System.out.println("Array object before sorting");
		for (String s1 : s) {
			System.out.println(s1);
		}
	   Arrays.sort(s);
	   System.out.println("Array object after natural sorting");
	   for(String s1:s) {
		   System.out.println(s1);
	   }
	}

}
