package javaProject;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		catchblock();
		
		String str = null;
		int a = 10;
		// System.out.println(str.length());
		try {
			System.out.println("Try Block ");
			System.out.println(a / 0);
			// System.out.println(str.length());
			System.out.println("Try Block -1");// It will not execute

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
			System.out.println("Catch Block ");
		}

	}

	public static void catchblock() {

		try {
			int a[] = new int[5];
			a[10] = 30 / 7;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
