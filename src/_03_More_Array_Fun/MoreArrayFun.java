package _03_More_Array_Fun;

import java.awt.print.Printable;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"A","B","C","D","E","F","G","H"}; 
		print(strings);
		reverse(strings);
		everyother(strings);
		randomstring(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] array) {
		System.out.println("! Print !");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse(String[] array) {
		System.out.println("! Reverse !");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[array.length - i - 1]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyother(String[] array) {
		System.out.println("! Every Other !");
		boolean switcher = true;
		for (int i = 0; i < array.length; i++) {
			if (switcher) {
				System.out.println(array[i]);
				switcher = false;
			} else if (switcher == false) {
				
				switcher = true;
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomstring(String[] array) {
		System.out.println("! Random !");
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[random.nextInt(array.length)]);
		}
	}
	
}
