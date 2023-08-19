package javaProject;

import java.util.Arrays;

public class StringtoArray {
	
	public static void main(String[] args) {
		
		
		String str = "4,8,12,8,1,8,2,8,4";
		System.out.println("String is : "+str);
		
		//String To Array 
		
		String arry []= str.split(",");
		System.out.println("Convert String to Array "+ Arrays.toString(arry));
		int count =0;
		
		for(int i =0;i<arry.length;i++) {
			
			
		for(int j= i+1 ;j<arry.length;j++) {
			if(arry[j]==arry[i]) {
				
				
				System.out.println( "Count of : "+ arry[j]);
			}
			
			
		}
		}
		
		
	}

}
