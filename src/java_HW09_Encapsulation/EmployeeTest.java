package java_HW09_Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Poly");
		employee.setAge(27);
		employee.setSex('F');
		employee.setUscitizen(true);

		System.out.println("Employee Name Is : " + employee.getName() + "\nEmployeeAge Is : " + employee.getAge()
				+ "\nEmployee Sex Is : " + employee.getSex() + "\nEmployee status US Citizen : "
				+ employee.isUscitizen());

	}
}
