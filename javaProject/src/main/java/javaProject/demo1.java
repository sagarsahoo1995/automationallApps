package javaProject;

import java.util.Arrays;
import java.util.HashMap;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "4,8,12,8,1,8,2,8,4";
		String[] strArray = null;  
		strArray=str.split(","); 
		System.out.println(Arrays.toString(strArray));  
		
		
		for(int i = 0; i<=strArray.length;i++) {
			System.out.println("String Array loop cpont is-----"+i);
			System.out.println("Array Value for loopcount is -----"+ strArray[i]);
			int num=Integer.parseInt(strArray[i]);
			try {
					if(num%2==0) {
						//char value = str.charAt(i);	
						System.out.println("value is -----"+ num);
					}
			}
			catch (NumberFormatException ex){
            ex.printStackTrace();
			}
		}
	}

}
