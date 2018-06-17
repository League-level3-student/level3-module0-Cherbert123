package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"A","B","C","D","E"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "F";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "G";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
		int[] intA = new int[50];

		//8. use a for loop to make every value of the integer array a random number
	
		Random random = new Random();
		for (int i = 0; i < intA.length; i++) {
			intA[i] = random.nextInt(100);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = 101;
		for (int i = 0; i < intA.length; i++) {
			if (smallest > intA[i]) {
				smallest = intA[i];
			}
			
		}
		System.out.println("Smallest : " + smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
			
		}
		//11. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < intA.length; i++) {
			if (largest < intA[i]) {
				largest = intA[i];
			}
			
		}
		System.out.println("Largest : " + largest);
		//12. print only the last element in the array
		System.out.println("Last : " + intA[intA.length - 1]);
	}
}
