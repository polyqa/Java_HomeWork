package java_HW08_Abstraction;

public abstract class MedicalSchool {

	public MedicalSchool() {
		System.out.println("This is a default contructor inside medical school abstract Class");
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non abstruct method ");
	}

}
