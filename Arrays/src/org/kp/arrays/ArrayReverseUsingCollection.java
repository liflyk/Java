package org.kp.arrays;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayReverseUsingCollection {

	public static void main(String[] args) {
		int[] number = { 1, 4, 5, 2, 7, 6, 3, 8 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : number) {
			list.add(i);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
