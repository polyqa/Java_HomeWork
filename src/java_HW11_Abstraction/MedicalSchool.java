package java_HW11_Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() {
		System.out.println("This is a default contructor inside medical school abstract Class");
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstract method");
	}

	public static void white() {
		System.out.println("This is a static method from medical school abstract class");
	}

	// public default void orange () {
	// System.out.println("This is default method from university interface");
	// An Abstract Class can't have a default method

}
