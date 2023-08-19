package framework;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayOperatiosn { // Class in java only public or default

	int arr[] = { 1, 2, 3, 4, 5, 1, 4, 4 }; // Instance Variable
	int[] arr_dep = new int[5];
	int[] sum = null;
	static String name = "Sagar Sahoo"; // Static variable
	int age = 28;

	public static void main(String[] args) {

		// Create Object of the class to call instance variable and methods

		ArrayOperatiosn ao = new ArrayOperatiosn(); // oa store in heap memory

		// print the Array

		for (int value : ao.arr) {

			System.out.println("Value on the Array Is: " + value);
		}

		// call the Static Variable on static method
		System.out.println("Call the static variable Directly: " + name);

		System.out.println("Call the static variable with class name: " + ArrayOperatiosn.name);

		System.out.println("Call the static variable with object refernce name: " + ao.name);

		/*
		 * In Java, memory is divided into two parts: stack memory and heap memory.
		 * 
		 * Stack memory is used to store local variables and method calls.
		 * 
		 * Heap memory is used to store objects created during the execution of a Java
		 * program.
		 * 
		 */

		// Convert Array to string

		System.out.println("-------------------------------------------------------------");

		String arrayToString = Arrays.toString(ao.arr);

		System.out.println("Convert Array to string : " + arrayToString);

		System.out.println("Size of the string: " + arrayToString.length());

		System.out.println("/*********************Find the Duplicate Method Results************************/");

		ao.findtheduplicate();

	}

	public void findtheduplicate() {

		int i;
		int j;

		// Find the counts of duplicate

		for (i = 0; i < arr.length; i++) { // Outer loop take the each element

			int frequence = 1;

			for (j = i + 1; j < arr.length; j++) { // Inner loop compare the element we taken from outer with rest
													// of the elemnet

				// Pass the condition to verify the duplicate

				if (arr[i] == arr[j]) { // it will do the real compare and return a boolean value

					frequence++;

				} else {

					break;

				}

			}
			i = j - 1;
			if (frequence > 1) {

				// printing the output
				System.out.println(arr[i] + " --> " + frequence);
			}

		}

	}

	public void arrayList() {
		
		
		Object newArray []= new Object[5];
		newArray [0]="Sagar";
		
	}

}
