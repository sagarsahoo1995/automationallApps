package javaProject;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		/*
		 * String str = "Sagar"; StringBuffer st = new StringBuffer(); st.append(str);
		 * System.out.println(st); System.out.println(st.reverse());
		 */
		
		
		String str = "i am sagar";
		String nstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
		    ch = str.charAt(i);
		    nstr = ch + nstr; 
		    System.out.println(nstr);
		}
		System.out.println("Reversed word: " + nstr);
	
	
	
	}

}
