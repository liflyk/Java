package org.kp.arrays;

public class ArrayReverseWithoutAPI {

	public static void main(String[] args) {
		int[] number = { 1, 4, 5, 2, 7, 6, 3, 8 };
		int a = 0, b, temp;
		System.out.println("Array before reverse");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " , ");

		}
		System.out.println();
		b = number.length - 1;

		/*while (a < b) {
			temp = number[a];
			number[a] = number[b];
			number[b] = temp;
			a++;
			b--;
		}
		for (int i = 0; i < number.length; i++)*/

			for (int i = b ; i >= 0; i--) {
				System.out.print(number[i] + " , ");
			}
	}

}
