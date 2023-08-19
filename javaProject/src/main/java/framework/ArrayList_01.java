package framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {
		// Array List

		// Declare Array List

		List<Object> automation = new ArrayList<>();

		// Add values on Array List
		automation.add("Java");
		automation.add("Selenium");
		automation.add("TestNG");
		automation.add("Maven");
		automation.add("Jenkin");

		System.out.println("Print the Array List: " + automation);
		System.out.println();

		// update the Array values

		automation.set(2, "jUnit");

		System.out.println("Print the updated Array list:" + automation);

		// Delete the Array Value

		System.out.println();

		automation.remove(3);

		System.out.println("Print After remove element: " + automation);

		System.out.println();

		// Add New Array List

		List<Object> api = new ArrayList<>();

		// Add values on Array List
		api.add("Rest Assured");
		api.add("BDD");
		api.add("TestNG");

		// Add two Array List
		
		automation.addAll(api);

		System.out.println("Add both Array List " + automation);
		
	

		
		
		
		

	}

}
