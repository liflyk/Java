package org.kp.arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 32, 10, 44, 22, 54, 32, 11, 31, 53 };

		// before sorting
		System.out.println("Before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// after sorting
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (int a : arr)
			System.out.println(a);
		// removing duplicates
		System.out.println("After removing duplcate");
		int d = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[d] != arr[i]) {
				d++;
				arr[d] = arr[i];
			}
		}
		for (int i = 0; i < d; i++) {
			System.out.println(arr[i]);
		}

	}

}
