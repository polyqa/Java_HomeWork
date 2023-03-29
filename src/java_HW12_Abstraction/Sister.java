package java_HW12_Abstraction;

public class Sister {

	public int sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total1 is " + total1);
		return total1;
	}

	public void sister(String age4, int age3) {
		int total2 = Integer.parseInt(age4) + age3;
		System.out.println("Total2 is " + total2);
	}

	public static void sister(int age2, int age3, String age4) {
		int total3 = age2 + age3 + Integer.parseInt(age4);
		System.out.println("Total3 is " + total3);
	}

	public final void sister(String age4, int age3, int age1, int age5) {
		int total4 = Integer.parseInt(age4) + age3 + age1 + age5;
		System.out.println("Total4 is " + total4);
		/*
		 * When different methods exist with the same method name but with different
		 * parameters or signature, it is called method overloading. Method Overloading
		 * occurs during compile time. ......................................
		 * .................................................
		 */
	}
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total5 =age1+age2+age3+Integer.parseInt(age4)+age5+ age6;
		System.out.println("Total5 is "+ total5);
	}

}
